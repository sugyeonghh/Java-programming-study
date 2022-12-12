// 프로그래머스 - 과일 장수

import java.util.Arrays;

public class FruitSeller {
	public int solution(int k, int m, int[] score) {
		Arrays.sort(score);
		int sum = 0;
		int start = score.length % m;

		for (int i = start; i < score.length; i += m) {
			sum += score[i];
		}
		return sum * m;
	}

	public static void main(String[] args) {
		FruitSeller fruitSeller = new FruitSeller();
		System.out.println(fruitSeller.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1})); // 8
		System.out.println(fruitSeller.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));  // 33
	}
}
