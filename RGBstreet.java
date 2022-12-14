// 백준 - 1149 RGB거리

import java.util.Arrays;
import java.util.Scanner;

public class RGBstreet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = Integer.parseInt(scanner.nextLine());
		int[][] rgb = new int[size][3];
		int[][] dp = new int[size][3];
		for (int i = 0; i < size; i++) {
			String[] tmp = scanner.nextLine().split(" ");
			for (int j = 0; j < 3; j++) {
				rgb[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		dp[0] = rgb[0];
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < 3; j++) {
				int tmp;
				if (j == 0) tmp = Math.min(dp[i - 1][1], dp[i - 1][2]);
				else if (j == 1) tmp = Math.min(dp[i - 1][0], dp[i - 1][2]);
				else tmp = Math.min(dp[i - 1][0], dp[i - 1][1]);
				dp[i][j] = tmp + rgb[i][j];
			}
		}

		System.out.println(Arrays.stream(dp[size - 1]).min().getAsInt());
	}
}
