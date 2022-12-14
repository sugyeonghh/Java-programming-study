// 프로그래머스 - 최빈값 구하기

import java.util.*;

public class Mode {
	public int solution(int[] array) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int n : array) hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);

		int max = Collections.max(hashMap.values());
		int cnt = 0;
		int result = 0;
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == max) {
				cnt++;
				result = entry.getKey();
			}
		}
		return cnt == 1 ? result : -1;
	}

	public static void main(String[] args) {
		Mode mode = new Mode();
		System.out.println(mode.solution(new int[]{1, 2, 3, 3, 3, 4})); // 3
		System.out.println(mode.solution(new int[]{1, 1, 2, 2}));       // -1
		System.out.println(mode.solution(new int[]{1}));                // 1
	}
}
