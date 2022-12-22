// 프로그래머스 - 햄버거 만들기

import java.util.Stack;

public class Hamburger {
	public int solution(int[] ingredient) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int in : ingredient) {
			stack.push(in);
			if (stack.size() >= 4) {
				int size = stack.size();
				if(stack.get(size - 1) == 1
						&& stack.get(size - 2) == 3
						&& stack.get(size - 3) == 2
						&& stack.get(size - 4) == 1) {
					result++;
					stack.pop();
					stack.pop();
					stack.pop();
					stack.pop();
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Hamburger divideString = new Hamburger();
		System.out.println(divideString.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));    // 2
		System.out.println(divideString.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));    // 0
	}
}
