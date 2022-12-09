// 백준 1780 종이의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfPaper {
	// 입력받을 종이
	public static int[][] paper;
	// -1, 0, 1 로 이루어진 종이들의 개수 저장
	public static int[] result = new int[3];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		paper = new int[size][size];
		// input 받아오기
		for (int i = 0; i < size; i++) {
			String[] paperStr = br.readLine().split(" ");
			for (int j = 0; j < size; j++) paper[i][j] = Integer.parseInt(paperStr[j]);
		}
		// 분할 재귀
		partition(0, 0, size);
		// 저장된 결과값 출력
		for (int r : result) System.out.println(r);
	}

	private static void partition(int row, int col, int size) {
		// 만약 해당 종이가 한 숫자로 이루어진 숫자면, 해당 숫자의 종이의 개수 증가(result)
		if (checkNum(row, col, size)) {
			// paper[row][col] == -1 -> result[0] += 1
			// paper[row][col] == 0 -> result[1] += 1
			// paper[row][col] == 1 -> result[2] += 1
			result[paper[row][col] + 1] += 1;
			return;
		}

		// 분할 정복 -> 9개로 나누어야 함 -> 행,열 나누기 3 해서 접근
		int div = size / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				partition(row + div * i, col + div * j, div);
			}
		}
	}

	// 종이가 한 숫자로 이루어져 있는지 체크하는 함수
	// 해당 좌표부터 size * size 만큼 좌표 비교
	// 기준 좌표의 숫자와 다른 좌표들의 숫자가 같으면 true, 다르면 false
	private static boolean checkNum(int row, int col, int size) {
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (paper[row][col] != paper[i][j]) return false;
			}
		}
		return true;
	}
}
