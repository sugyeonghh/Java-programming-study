// 프로그래머스 - 성격 유형 검사하기

import java.util.HashMap;

public class MBTI {
	public String solution(String[] survey, int[] choices) {
		HashMap<Character, Integer> mbti = new HashMap<>(){{
			put('R', 0);
			put('T', 0);
			put('C', 0);
			put('F', 0);
			put('J', 0);
			put('M', 0);
			put('A', 0);
			put('N', 0);
		}};

		for (int i = 0; i < survey.length; i++) {
			if (choices[i] < 4) mbti.put(survey[i].charAt(0), mbti.get(survey[i].charAt(0)) + 4 - choices[i]);
			else if (choices[i] > 4) mbti.put(survey[i].charAt(1), mbti.get(survey[i].charAt(1)) + choices[i] - 4);
		}

		String result = "";
		result += mbti.get('R') >= mbti.get('T') ? "R" : "T";
		result += mbti.get('C') >= mbti.get('F') ? "C" : "F";
		result += mbti.get('J') >= mbti.get('M') ? "J" : "M";
		result += mbti.get('A') >= mbti.get('N') ? "A" : "N";

		return result;
	}

	public static void main(String[] args) {
		MBTI mbti = new MBTI();
		System.out.println(mbti.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));   // "TCMA"
		System.out.println(mbti.solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1,3 })); // "RCJA"
	}
}
