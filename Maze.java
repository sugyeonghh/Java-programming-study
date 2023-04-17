// 백준 - 2178 미로 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Maze {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();
		StringTokenizer st = new StringTokenizer(size);
		int col = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());
		int[][] graph = new int[col][row];
		for (int i = 0; i < col; i++) {
			String[] lineNum = br.readLine().split("");
			for (int j = 0; j < row; j++) {
				graph[i][j] = Integer.parseInt(lineNum[j]);
			}
		}
		System.out.println(bfs(graph, col, row));
	}

	private static int bfs(int[][] graph, int col, int row) {
		List<int[]> queue = new ArrayList<>();
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		queue.add(new int[]{0, 0});
		while (queue.size() > 0) {
			int[] vertex = queue.remove(0);
			int y = vertex[0];
			int x = vertex[1];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && nx < row && ny >= 0 && ny < col && graph[ny][nx] == 1) {
					queue.add(new int[]{ny, nx});
					graph[ny][nx] = graph[y][x] + 1;
				}
			}
		}
		return graph[col - 1][row - 1];
	}
}
