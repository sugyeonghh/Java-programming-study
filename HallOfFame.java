// 프로그래머스 - 명예의 전당(1)

import java.util.*;

public class HallOfFame {
	// ArrayList
	public int[] solution2(int k, int[] score) {
		int[] result = new int[score.length];
		ArrayList<Integer> rank = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			rank.add(score[i]);
			if (i >= k) rank.remove(Collections.min(rank));
			result[i] = Collections.min(rank);
		}
		return result;
	}

	// priorityQueue
	public int[] solution(int k, int[] score) {
		int[] result = new int[score.length];
		PriorityQueue<Integer> rank = new PriorityQueue<>();

		for (int i = 0; i < score.length; i++) {
			rank.add(score[i]);
			if (i >= k) rank.poll();
			result[i] = rank.peek();
		}
		return result;
	}

	public static void main(String[] args) {
		HallOfFame hallOfFame = new HallOfFame();

		String output1 = Arrays.toString(hallOfFame.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
		System.out.println(output1.equals("[10, 10, 10, 20, 20, 100, 100]"));
		String output2 = Arrays.toString(hallOfFame.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
		System.out.println(output2.equals("[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]"));
		String output3 = Arrays.toString(hallOfFame.solution(5, new int[]{2, 3, 1}));
		System.out.println(output3.equals("[2, 2, 1]"));
	}
}
