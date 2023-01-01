// 프로그래머스 - 두 큐 합 같게 만들기

import java.util.LinkedList;
import java.util.Queue;

public class MakeEqual {
	public int solution(int[] queue1, int[] queue2) {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		long sum1 = initQueue(queue1, q1);
		long sum2 = initQueue(queue2, q2);

		int result = 0;

		while (sum1 != sum2) {
			if (q1.isEmpty() || q2.isEmpty() || result > q1.size() + q2.size() + 1) return -1;
			if (sum1 > sum2) {
				int target = q1.poll();
				sum1 -= target;
				sum2 += target;
				q2.offer(target);
			} else {
				int target = q2.poll();
				sum2 -= target;
				sum1 += target;
				q1.offer(target);
			}
			result += 1;
		}
		return result;
	}

	private long initQueue(int[] arrQueue, Queue<Integer> queue) {
		long sum = 0;
		for (int q : arrQueue) {
			queue.add(q);
			sum += q;
		}
		return sum;
	}

	public static void main(String[] args) {
		MakeEqual makeEqual = new MakeEqual();
		System.out.println(makeEqual.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5 ,1}));   // 2
		System.out.println(makeEqual.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));   // 7
		System.out.println(makeEqual.solution(new int[]{1, 1}, new int[]{1, 5}));   // -1
		System.out.println(makeEqual.solution(new int[]{3, 3, 3, 3}, new int[]{3, 3, 21, 3}));   // -1
	}
}
