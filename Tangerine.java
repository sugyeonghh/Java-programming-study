// 프로그래머스 - 귤 고르기

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tangerine {
	public int solution(int k, int[] tangerine) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int t : tangerine) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

		for (Map.Entry<Integer, Integer> entry : entryList) {
			k -= entry.getValue();
			result++;
			if (k <= 0) break;
		}
		return result;
	}

	public static void main(String[] args) {
		Tangerine tangerine = new Tangerine();
		System.out.println(tangerine.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));   // 3
		System.out.println(tangerine.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));   // 2
		System.out.println(tangerine.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));   // 1
	}
}
