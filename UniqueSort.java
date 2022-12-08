// 프로그래머스 - 특이한 정렬

import java.util.*;

public class UniqueSort {
	public int[] solution(int[] numlist, int n) {
		List<Integer> nums = new ArrayList<>();
		Arrays.sort(numlist);
		for (int num : numlist) nums.add(num);
		nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
		Collections.reverse(nums);
		return nums.stream().mapToInt(num -> num).toArray();
	}

	public static void main(String[] args) {
		UniqueSort uniqueSort = new UniqueSort();
		String output1 = Arrays.toString(uniqueSort.solution(new int[]{1, 2, 3, 4, 5, 6}, 4));
		System.out.println(output1 + " " + output1.equals("[4, 5, 3, 6, 2, 1]"));

		String output2 = Arrays.toString(uniqueSort.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30));
		System.out.println(output2 + " " + output2.equals("[36, 40, 20, 47, 10, 6, 7000, 10000]"));

		String output3 = Arrays.toString(uniqueSort.solution(new int[]{10,9,8,7,6,5,4,3,2,1,11}, 6));
		System.out.println(output3 + " " + output3.equals("[6, 7, 5, 8, 4, 9, 3, 10, 2, 11, 1]"));
	}
}
