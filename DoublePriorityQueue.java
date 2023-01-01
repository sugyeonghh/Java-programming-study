// 프로그래머스 - 이중우선순위큐

import java.util.*;

public class DoublePriorityQueue {
	public int[] solution(String[] operations) {
		PriorityQueue<Integer> minQueue = new PriorityQueue<>();                            // 오름차순
		PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());  // 내림차순

		for (String oper : operations) {
			String command = oper.split(" ")[0];
			int num = Integer.parseInt(oper.split(" ")[1]);
			if (command.equals("I")) {
				minQueue.offer(num);
				maxQueue.offer(num);
			}
			else if (num == 1 && !maxQueue.isEmpty()) {
				minQueue.remove(maxQueue.poll());
			}
			else if (num == -1 && !minQueue.isEmpty()){
				maxQueue.remove(minQueue.poll());
			}
		}
		int[] result = new int[2];
		result[0] = !maxQueue.isEmpty() ? maxQueue.poll() : 0;
		result[1] = !minQueue.isEmpty() ? minQueue.poll() : 0;
		return result;
	}

	public static void main(String[] args) {
		DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();
		System.out.println(Arrays.toString(doublePriorityQueue.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));  // [0, 0]
		System.out.println(Arrays.toString(doublePriorityQueue.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}))); // [333, -45]
	}
}
