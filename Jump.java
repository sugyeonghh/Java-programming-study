// 프로그래머스 - 점프와 순간 이동

public class Jump {
	public int solution(int n) {
//		int[] dp = new int[n + 1];
//
//		dp[1] = dp[2] = 1;
//		for (int i = 3; i <= n; i++) {
//			dp[i] = Math.min(dp[i - 1] + 1, i % 2 == 0 ? dp[i / 2] : dp[i / 2] + 1);
//		}
//
//		return dp[n];

		return Integer.bitCount(n);
	}

	public static void main(String[] args) {
		Jump jump = new Jump();
		System.out.println(jump.solution(5));
		System.out.println(jump.solution(6));
		System.out.println(jump.solution(5000));
	}
}
