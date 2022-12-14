// 백준 1780 종이의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfPaper {
	public static int[][] paper;
	public static int[] result = new int[3];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		paper = new int[size][size];
		for (int i = 0; i < size; i++) {
			String[] paperStr = br.readLine().split(" ");
			for (int j = 0; j < size; j++) paper[i][j] = Integer.parseInt(paperStr[j]);
		}
		partition(0, 0, size);
		for (int r : result) System.out.println(r);
	}

	private static void partition(int row, int col, int size) {
		if (checkNum(row, col, size)) {
			result[paper[row][col] + 1] += 1;
			return;
		}

		int div = size / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				partition(row + div * i, col + div * j, div);
			}
		}
	}

	private static boolean checkNum(int row, int col, int size) {
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (paper[row][col] != paper[i][j]) return false;
			}
		}
		return true;
	}
}
