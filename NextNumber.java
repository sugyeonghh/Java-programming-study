// 프로그래머스 - 다음에 올 숫자

public class NextNumber {
	public int solution(int[] common) {
		if (Math.abs(common[0] - common[1]) == Math.abs(common[1] - common[2]))
			return (common[1] - common[0]) + common[common.length - 1];
		return (common[1] / common[0]) * common[common.length - 1];
	}

	public static void main(String[] args) {
		NextNumber nextNumber = new NextNumber();
		System.out.println(nextNumber.solution(new int[]{1, 2, 3, 4}));     // 5
		System.out.println(nextNumber.solution(new int[]{2, 4, 8}));        // 16

	}
}
