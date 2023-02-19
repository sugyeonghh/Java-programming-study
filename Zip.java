// 프로그래머스 - 압축

import java.util.*;

public class Zip {
	public int[] solution(String msg) {
		Map<String, Integer> dict = new HashMap<>();
		Queue<Character> queue = new LinkedList<>();
		List<Integer> result = new LinkedList<>();

		int count = 1;
		for (char alpha = 'A'; alpha <= 'Z'; alpha++) dict.put("" + alpha, count++);
		for (int i = 0; i < msg.length(); i++) queue.add(msg.charAt(i));

		while (!queue.isEmpty()) {
			String w = "" + queue.poll();

			while (!queue.isEmpty() && dict.containsKey(w + queue.peek())) {
				w += queue.poll();
			}
			result.add(dict.get(w));
			if (!queue.isEmpty()) dict.put(w + queue.peek(), count++);
		}

		return result.stream().mapToInt(n -> n).toArray();
	}

	public static void main(String[] args) {
		Zip zip = new Zip();
		System.out.println(Arrays.toString(zip.solution("KAKAO")));
		System.out.println(Arrays.toString(zip.solution("TOBEORNOTTOBEORTOBEORNOT")));
		System.out.println(Arrays.toString(zip.solution("ABABABABABABABAB")));
	}
}
