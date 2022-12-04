// 프로그래머스 - 키패드 누르기

public class PressKeypad {
	public String solution(int[] numbers, String hand) {
		String result = "";
		for (int n : numbers) {
			switch (n) {
				case 1: case 4: case 7:
					result += "L";
					break;
				case 3: case 6: case 9:
					result += "R";
					break;
				case 2: case 5: case 8: case 0:
					if (result)
					break;

			}
		}


	}

	public static void main(String[] args) {
		PressKeypad pressKeypad = new PressKeypad();
		System.out.println(pressKeypad.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));  // "LRLLLRLLRRL"
		System.out.println(pressKeypad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left")); // "LRLLRRLLLRR"
		System.out.println(pressKeypad.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));   // "LLRLLRLLRL"
	}
}
