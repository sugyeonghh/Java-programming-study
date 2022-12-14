// 백준 - 1188 음식 평론가

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FoodCritic {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		System.out.println(m - gcd(n, m));
	}

	private static int gcd(int a, int b) {
		int c = a % b;
		if (c == 0) return b;
		return gcd(b, c);
	}
}
