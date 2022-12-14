// 백준 16637 괄호 추가하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AddParenthesis {
	static int result = -2147483648;
	static ArrayList<Integer> nums = new ArrayList<>();
	static ArrayList<Character> operator = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) nums.add(Character.getNumericValue(input.charAt(i)));
			else operator.add(input.charAt(i));
		}

		find(0, nums.get(0));
		System.out.println(result);
	}

	private static void find(int idx, int total) {
		if (idx == operator.size()) {
			result = Math.max(result, total);
			return;
		}
		find(idx + 1, calculate(total, nums.get(idx + 1), operator.get(idx)));

		if (idx + 2 <= nums.size() - 1) {
			find(idx + 2, calculate(total, calculate(nums.get(idx + 1), nums.get(idx + 2), operator.get(idx + 1)), operator.get(idx)));
		}
	}

	private static int calculate(int a, int b, char oper) {
		if (oper == '-') return a - b;
		else if (oper == '+') return a + b;
		else return a * b;
	}
}
