// 프로그래머스 - 정수 삼각형

public class Triangle {
	public int solution(int[][] triangle) {
		int n = triangle.length;

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < triangle[i].length - 1; j++) {
				triangle[i - 1][j] += Math.max(triangle[i][j], triangle[i][j + 1]);
			}
		}
		return triangle[0][0];
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(triangle.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
	}
}
