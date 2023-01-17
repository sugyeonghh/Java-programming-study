// 프로그래머스 - 최솟값 만들기

import java.util.Arrays;

public class MakeMinNum {
	public int solution(int[] A, int[] B) {
		int sum = 0;
		int n = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < n; i++) sum += A[i] * B[n - i - 1];
		return sum;
	}

	public static void main(String[] args) {
		MakeMinNum makeMinNum = new MakeMinNum();
		System.out.println(makeMinNum.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
	}
}
