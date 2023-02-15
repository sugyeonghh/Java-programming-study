// 프로그래머스 - 영어 끝말잇기

import java.util.*;

public class WordChain {
	public int[] solution(int n, String[] words) {
		Set<String> wordSet = new HashSet<>();
		int[] result = new int[2];

		wordSet.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			String last = words[i - 1];
			if (last.charAt(last.length() - 1) == words[i].charAt(0)) wordSet.add(words[i]);
			if (wordSet.size() != i + 1) {
				result[0] = (i % n) + 1;
				result[1] = (i / n) + 1;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		WordChain wordChain = new WordChain();
		System.out.println(Arrays.toString(wordChain.solution(3, new String[]{
				"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"
		})));
		System.out.println(Arrays.toString(wordChain.solution(5, new String[]{
				"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"
		})));
		System.out.println(Arrays.toString(wordChain.solution(2, new String[]{
				"hello", "one", "even", "never", "now", "world", "draw"
		})));
	}
}
