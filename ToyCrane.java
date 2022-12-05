// 프로그래머스 크레인 인형뽑기 게임

import java.util.Stack;

public class ToyCrane {
	public int solution(int[][] board, int[] moves) {
		Stack<Integer> stack = new Stack<>();
		int result = 0;
		for (int m : moves) {
			int toy = pickToy(board, m);
			if (!stack.isEmpty() && stack.peek() == toy) {
				stack.pop();
				result += 2;
			}
			else if (toy != -1) stack.push(toy);
		}
		return result;
	}

	private int pickToy(int[][] board, int m) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][m - 1] != 0) {
				int tmp = board[i][m - 1];
				board[i][m - 1] = 0;
				return tmp;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ToyCrane toyCrane = new ToyCrane();

		int[][] board = new int[][]{
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
		};
		int[] moves = new int[]{1,5,3,5,1,2,1,4};
		System.out.println(toyCrane.solution(board, moves));    // 4
	}
}
