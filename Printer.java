// 프로그래머스 - 프린터

import java.util.*;

public class Printer {
	public int solution(int[] priorities, int location) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		int result = 0;

		for (int priority : priorities) {
			queue.add(priority);
		}

		while (!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (queue.peek() == priorities[i]) {
					result++;
					queue.poll();
					if (i == location) return result;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Printer printer = new Printer();
		System.out.println(printer.solution(new int[]{2, 1, 3, 2}, 2));
		System.out.println(printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
	}
}
