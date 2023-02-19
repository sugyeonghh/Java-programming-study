// 프로그래머스 - k진수에서 소수 개수 구하기

public class RadixPrime {
	public int solution(int n, int k) {
		String[] nums = Integer.toString(n, k).split("0");
		int count = 0;

		for (String num : nums) {
			if (!num.equals("") && isPrime(Double.parseDouble(num))) count++;
		}

		return count;
	}

	private boolean isPrime(double n) {
		if (n == 2) return true;
		else if (n <= 1 || n % 2 == 0) return false;

		for (int i = 3; i <= n / i; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		RadixPrime radixPrime = new RadixPrime();
		System.out.println(radixPrime.solution(437674, 3)); // 3
		System.out.println(radixPrime.solution(110011, 10)); // 2
	}
}