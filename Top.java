// 백준 - 2493 탑

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Top {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Stack<Integer> bigger = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) bigger.add(Integer.parseInt(st.nextToken()));
		int[] arr = bigger.stream().mapToInt(i -> i).toArray();

		Stack<Integer> smaller = new Stack<>();
		int[] result = new int[n];
		for (int i = n - 1; i > 0; i--) {
			int top = arr[i];
			while (!bigger.isEmpty()) {
				if (bigger.peek() > top) {
					result[i] = bigger.size();
					while (!smaller.isEmpty()) bigger.add(smaller.pop());
					break;
				} else smaller.add(bigger.pop());
			}
		}

		System.out.println(Arrays.toString(result).replaceAll(",", "")
				.replaceAll("\\[", "")
				.replaceAll("\\]", ""));
	}
}
