// 프로그래머스 - 짝지어 제거하기

import java.util.Stack;

public class Pair {
	public int solution(String s) {
		Stack<Character> stack = new Stack<>();

		for (char alpha : s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == alpha) stack.pop();
			else stack.push(alpha);
		}
		return stack.isEmpty() ? 1 : 0;
	}

	public static void main(String[] args) {
		Pair pair = new Pair();
		System.out.println(pair.solution("baabaa"));
		System.out.println(pair.solution("cdcd"));
	}
}
