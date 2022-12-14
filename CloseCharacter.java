// 프로그래머스 - 가장 가까운 같은 글자

import java.util.Arrays;
import java.util.HashMap;

public class CloseCharacter {
	public int[] solution(String s) {
		HashMap<Character, Integer> alpha = new HashMap<>();
		int[] result = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (!alpha.containsKey(s.charAt(i))) result[i] = -1;
			else result[i] = i - alpha.get(s.charAt(i));
			alpha.put(s.charAt(i), i);
		}
		return result;
	}

	public static void main(String[] args) {
		CloseCharacter closeCharacter = new CloseCharacter();
		System.out.println(Arrays.toString(closeCharacter.solution("banana"))); // [-1, -1, -1, 2, 2, 2]
		System.out.println(Arrays.toString(closeCharacter.solution("foobar"))); // [-1, -1, 1, -1, -1, -1]
	}
}
