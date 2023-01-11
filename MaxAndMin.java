// 프로그래머스 - 최댓값과 최솟값

public class MaxAndMin {
	public String solution(String s) {
		String[] nums = s.split(" ");
		int min, max;
		min = max = Integer.parseInt(nums[0]);

		for (String strNum : nums) {
			int num = Integer.parseInt(strNum);
			if (num < min) min = num;
			if (num > max) max = num;
		}
		return min + " " + max;
	}

	public static void main(String[] args) {
		MaxAndMin maxAndMin = new MaxAndMin();
		System.out.println(maxAndMin.solution("1 2 3 4"));  // "1 4"
	}
}
