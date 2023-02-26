// 프로그래머스 - 카펫

import java.util.Arrays;

public class Carpet {
	public int[] solution(int brown, int yellow) {
		int sum = brown + yellow;
		int[] result = new int[2];

		for (int i = 1; i <= yellow / i; i++) {
			if (yellow % i == 0) {
				if ((i + 2) * (yellow / i + 2) == sum) {
					result[0] = yellow / i + 2;
					result[1] = i + 2;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Carpet carpet = new Carpet();
		System.out.println(Arrays.toString(carpet.solution(10, 2)));
		System.out.println(Arrays.toString(carpet.solution(8, 1)));
		System.out.println(Arrays.toString(carpet.solution(24, 24)));
	}
}
