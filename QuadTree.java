// 백준 - 1992 쿼드트리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {
	static int[][] board;
	static String result = "";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		board = new int[size][size];
		for (int i = 0; i < size; i++) {
			String[] input = br.readLine().split("");
			for (int j = 0; j < size; j++) board[i][j] = Integer.parseInt(input[j]);
		}
		partition(0, 0, size);
		System.out.println(result);
	}

	private static void partition(int row, int col, int size) {
		if (checkNum(row, col, size)) {
			result += board[row][col];
			return ;
		}
		int div = size / 2;
		result += "(";
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				partition(row + div * i, col + div * j, div);
			}
		}
		result += ")";
	}

	private static boolean checkNum(int row, int col, int size) {
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (board[row][col] != board[i][j]) return false;
			}
		}
		return true;
	}
}
