// 프로그래머스 - 키패드 누르기

public class PressKeypad {
	public String solution(int[] numbers, String hand) {
		String result = "";
		int left = 10;
		int right = 12;
		for (int n : numbers) {
			if (n == 1 || n == 4 || n == 7) result += "L";
			else if (n == 3 || n == 6 || n == 9) result += "R";
			else if (n == 0 || n == 2 || n == 5 || n == 8) {
				if (n == 0) n = 11;
				int leftDistance = Math.abs(n - left) / 3 + Math.abs(n - left) % 3;
				int rightDistance = Math.abs(n - right) / 3 + Math.abs(n - right) % 3;
				if (leftDistance < rightDistance) result += "L";
				else if (leftDistance > rightDistance) result += "R";
				else {
					if (hand.equals("left")) result += "L";
					else result += "R";
				}
			}
			if (result.charAt(result.length() - 1) == 'L') left = n;
			else right = n;
		}
		return result;
	}

	public static void main(String[] args) {
		PressKeypad pressKeypad = new PressKeypad();

		String output1 = pressKeypad.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
		System.out.println(output1 + " " + output1.equals("LRLLLRLLRRL"));

		output1 = pressKeypad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
		System.out.println(output1  + " " + output1.equals("LRLLRRLLLRR"));

		output1 = pressKeypad.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");
		System.out.println(output1  + " " + output1.equals("LLRLLRLLRL"));
	}
}
