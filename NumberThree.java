// 프로그래머스 - 저주의 숫자 3

public class NumberThree {
	public int solution(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += 1;
			while (!isValid(result)) result += 1;
		}
		return result;
	}

	private boolean isValid(int num) {
		return num % 3 != 0 && !String.valueOf(num).contains("3");
	}

	public static void main(String[] args) {
		NumberThree numberThree = new NumberThree();
		System.out.println(numberThree.solution(10));   // 16
		System.out.println(numberThree.solution(15));   // 25
		System.out.println(numberThree.solution(40));   // 76
	}
}
