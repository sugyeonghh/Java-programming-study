// 프로그래머스 - 타겟 넘버

import java.util.ArrayList;

public class TargetNumber {
	ArrayList<Integer> nums = new ArrayList<>();

	public int solution(int[] numbers, int target) {
		getNumber(numbers, numbers.length, 0, 0);
		return (int) nums.stream().filter(num -> num == target).count();
	}

	private void getNumber(int[] numbers, int size, int count, int num) {
		if (size == count) nums.add(num);
		if (count < size) {
			getNumber(numbers, size, count + 1, num + numbers[count]);
			getNumber(numbers, size, count + 1, num - numbers[count]);
		}
	}

	public static void main(String[] args) {
		TargetNumber targetNumber = new TargetNumber();
		System.out.println(targetNumber.solution(new int[]{1,1,1,1,1}, 3)); // 5
		System.out.println(targetNumber.solution(new int[]{4,1,2,1}, 4)); // 2
	}
}
