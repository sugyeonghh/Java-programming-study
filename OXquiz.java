// 프로그래머스 - OX퀴즈

import java.util.Arrays;

public class OXquiz {
	public String[] solution(String[] quiz) {
		String[] result = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] partition = quiz[i].split(" ");
			int sum = Integer.parseInt(partition[0]) + (partition[1].equals("+") ? 1 : -1) * Integer.parseInt(partition[2]);
			result[i] = sum == Integer.parseInt(partition[4]) ? "O" : "X";
		}
		return result;
	}

	public static void main(String[] args) {
		OXquiz oXquiz = new OXquiz();
		System.out.println(Arrays.toString(oXquiz.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));  // ["X", "O"]
		System.out.println(Arrays.toString(oXquiz.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));  // ["O", "O", "X", "O"]
	}
}
