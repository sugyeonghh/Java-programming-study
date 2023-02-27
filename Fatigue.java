// 프로그래머스 - 피로도

public class Fatigue {
	boolean[] visited;
	int result = 0;

	public int solution(int k, int[][] dungeons) {
		visited = new boolean[dungeons.length];
		dfs(k, dungeons, 0);

		return result;
	}

	private void dfs(int k, int[][] dungeons, int count) {
		for (int i = 0; i < dungeons.length; i++) {
			if (!visited[i] && dungeons[i][0] >= k) {
				visited[i] = true;
				dfs(k - dungeons[i][1], dungeons, count + 1);
			}
		}
		result = Math.max(count, result);
	}

	public static void main(String[] args) {
		Fatigue fatigue = new Fatigue();
		System.out.println(fatigue.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
	}
}
