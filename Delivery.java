// 프로그래머스 - 배달

public class Delivery {
	public int solution(int N, int[][] road, int K) {
		int result = 0;
		int max = 500001;
		int[][] map = new int[N][N];

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (i != j) map[i][j] = max;
			}
		}

		for (int i = 0; i < road.length; i++) {
			int to = road[i][0] - 1;
			int from = road[i][1] - 1;
			int value = road[i][2];
			if (map[to][from] > value) {
				map[to][from] = value;
				map[from][to] = value;
			}
		}

		// floyd-warshall
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					// 거쳐가는 경우
					// (1,3) vs (1,2) + (2,3)
					if (map[j][k] > map[j][i] + map[i][k])
						map[j][k] = map[j][i] + map[i][k];
				}
			}
		}

		for (int i = 0; i < map.length; i++)
			if (map[0][i] <= K) result++;
		return result;
	}


	public static void main(String[] args) {
		Delivery delivery = new Delivery();
		System.out.println(delivery.solution(6, new int[][]{{1,2,1},{1, 3, 2},{2, 3, 2},{3, 4, 3},{3, 5, 2},{3, 5, 3}, {5, 6, 1}}, 4));
	}
}
