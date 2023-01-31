// 프로그래머스 - 이진 변환 반복하기

import java.util.Arrays;

public class BinaryConversion {
//	public int[] solution(String s) {
//		int zero = 0;
//		int num;
//
//		for (char c : s.toCharArray())
//			if (c == '0') zero++;
//		num = s.length() - zero;
//
//		int count = 1;
//		while (num != 1) {
//			count++;
//			int len = 0;
//			while (num != 0) {
//				if (num % 2 == 0) zero++;
//				else len++;
//				num /= 2;
//			}
//			num = len;
//		}
//
//		return new int[]{count, zero};
//	}

	public int[] solution(String s) {
		int count = 0;
		int zero = 0;

		while (!s.equals("1")) {
			int len = s.length();
			s = s.replace("0", "");
			zero += len - s.length();
			s = Integer.toBinaryString(s.length());
			count++;
		}
		return new int[]{count, zero};
	}

	public static void main(String[] args) {
		BinaryConversion binaryConversion = new BinaryConversion();
		System.out.println(Arrays.toString(binaryConversion.solution("110010101001"))); // [3, 8]
		System.out.println(Arrays.toString(binaryConversion.solution("01110")));        // [3, 3]
		System.out.println(Arrays.toString(binaryConversion.solution("1111111")));      // [4, 1]
	}
}
