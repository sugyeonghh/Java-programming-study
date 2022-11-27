// 프로그래머스 - 체육복

import java.util.*;

public class GymSuit {
	public int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);
		int count = n - lost.length;

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = reserve[j] = -1;
					count++;
				}
			}
		}
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
					lost[i] = reserve[j] = -1;
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		GymSuit gymSuit = new GymSuit();
		System.out.println(gymSuit.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));   // 5
		System.out.println(gymSuit.solution(5, new int[]{2, 4}, new int[]{3}));   // 4
		System.out.println(gymSuit.solution(5, new int[]{2, 4}, new int[]{2}));   // 4
		System.out.println(gymSuit.solution(3, new int[]{3}, new int[]{1}));   // 2
		System.out.println(gymSuit.solution(5, new int[]{5}, new int[]{1}));   // 4
		System.out.println(gymSuit.solution(7, new int[]{2, 4, 7}, new int[]{1, 3, 5}));   // 6
		System.out.println(gymSuit.solution(8, new int[]{5, 6, 7 ,8}, new int[]{4, 7}));   // 6
		System.out.println(gymSuit.solution(5, new int[]{4, 2}, new int[]{3, 5}));   // 5
		System.out.println(gymSuit.solution(13, new int[]{1, 2, 5, 6, 10, 12, 13}, new int[]{2, 3, 4, 5, 7, 8, 9, 10, 11, 12}));   // 11


	}
}
