// 프로그래머스 - 연속 부분 수열 합의 개수

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumOfSums {
	public int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		int[] ele = Arrays.copyOf(elements, elements.length * 2);
		System.arraycopy(elements, 0, ele, elements.length, elements.length);

		for (int size = 1; size <= elements.length; size++) {
			for (int i = 0; i < elements.length; i++) {
				set.add(getSum(i, 0, ele, size));
			}
		}
		return set.size();
	}

	private int getSum(int i, int num, int[] elements, int size) {
		if (size == 0) return num;
		return getSum(i + 1, num + elements[i], elements, size - 1);
	}

//	public int solution(int[] elements) {
//		Set<Integer> set = new HashSet<>();
//		int len = elements.length;
//
//		for (int size = 1; size <= len; size++) {
//			for (int i = 0; i < len; i++) {
//				int sum = 0;
//				for (int j = i; j < i + size; j++) {
//					sum += elements[j % len];
//				}
//				set.add(sum);
//			}
//		}
//		return set.size();
//	}

	public static void main(String[] args) {
		NumOfSums numOfSums = new NumOfSums();
		System.out.println(numOfSums.solution(new int[]{7,9,1,1,4}));   // 18
	}
}
