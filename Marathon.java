// 프로그래머스 - 완주하지 못한 선수

import java.util.Arrays;

public class Marathon {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++)
			if (!completion[i].equals(participant[i])) return participant[i];
		return participant[i];
	}

	public static void main(String[] args) {
		Marathon marathon = new Marathon();

		System.out.println(marathon.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));   // "leo"
		System.out.println(marathon.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));   // "vinko"
		System.out.println(marathon.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));   // "mislav"
	}
}
