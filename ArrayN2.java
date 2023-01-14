// 프로그래머스 - n^2 배열 자르기

import java.util.Arrays;

public class ArrayN2 {
	public int[] solution(int n, long left, long right) {
		int[] result = new int[(int)(right - left + 1)];
		int idx = 0;

		while (left <= right) {
			result[idx++] = (int) Math.max(left / n, left % n) + 1;
			left++;
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayN2 arrayN2 = new ArrayN2();
		System.out.println(Arrays.toString(arrayN2.solution(4, 7, 14))); // [4,3,3,3,4,4,4,4]
	}
}
