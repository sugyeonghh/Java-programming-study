// 프로그래머스 - 다음 큰 숫자

public class Bigger {
//	public int solution(int n) {
//		String binary = Integer.toBinaryString(n);
//		int num = binary.replace("0", "").length();
//		int result = n + 1;
//
//		while (true) {
//			int one = Integer.toBinaryString(result).replace("0", "").length();
//			if (one == num) break;
//			result++;
//		}
//		return result;
//	}

	public int solution(int n) {
		int count = Integer.bitCount(n);
		int result = n + 1;

		while (true) {
			int one = Integer.bitCount(result);
			if (one == count) break;
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Bigger bigger = new Bigger();
		System.out.println(bigger.solution(78));    // 83
		System.out.println(bigger.solution(15));    // 23
	}
}
