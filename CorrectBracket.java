// 프로그래머스 - 올바른 괄호

import java.util.Stack;

public class CorrectBracket {
	boolean solution(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.add(c);
			}
			else {
				if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
				else return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		CorrectBracket correctBracket = new CorrectBracket();
		System.out.println(correctBracket.solution("()()"));    // true
		System.out.println(correctBracket.solution("(())()"));  // true
		System.out.println(correctBracket.solution(")()("));    // false
		System.out.println(correctBracket.solution("(()("));    // false
	}
}
