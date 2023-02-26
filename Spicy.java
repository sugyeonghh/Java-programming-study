// 프로그래머스 - 더 맵게

import java.util.PriorityQueue;

public class Spicy {
	public int solution(int[] scoville, int K) {
		int result = 0;
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int sco : scoville) minHeap.add(sco);

		while (!minHeap.isEmpty() && minHeap.peek() <= K) {
			int food = minHeap.poll();
			if (food < K && !minHeap.isEmpty()) {
				food += minHeap.poll() * 2;
				minHeap.add(food);
				result++;
			}
		}
		return minHeap.isEmpty() ? -1 : result;
	}

	public static void main(String[] args) {
		Spicy spicy = new Spicy();
		System.out.println(spicy.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
	}
}
