// 백준 11399 ATM

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int[] time = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(time);
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += time[i] * (num - i);
		}
		System.out.println(result);
	}
}
