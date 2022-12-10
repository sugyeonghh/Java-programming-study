// 백준 - 2630 색종이 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeColoredPaper {
	static int[][] paper;
	static int[] result = new int[2];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		paper = new int[size][size];
		for (int i = 0; i < size; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < size; j++) paper[i][j] = Integer.parseInt(input[j]);
		}
		partition(0, 0, size);
		for (int r : result) System.out.println(r);
	}

	private static void partition(int row, int col, int size) {
		if (checkNum(row, col, size)) {
			result[paper[row][col]] += 1;
			return ;
		}
		int div = size / 2;
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				partition(row + div * i, col + div * j, div);
	}

	private static boolean checkNum(int row, int col, int size) {
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++)
				if (paper[row][col] != paper[i][j]) return false;
		}
		return true;
	}
}
