// 프로그래머스 - 기능개발

import java.util.*;

public class FunctionDevelopment {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] time = new int[progresses.length];
		for (int i = 0; i < progresses.length; i++) {
			time[i] = ((100 - progresses[i]) / speeds[i]) + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0);
		}

		List<Integer> result = new ArrayList<>();
		int max = time[0];
		int count = 1;
		for (int i = 1; i < time.length; i++) {
			if (time[i] <= max) {
				count++;
			}
			else {
				max = time[i];
				result.add(count);
				count = 1;
			}
		}
		result.add(count);

		int[] resultArr = new int[result.size()];
		for (int i = 0; i < result.size(); i++) resultArr[i] = result.get(i);
		return resultArr;
	}

	public static void main(String[] args) {
		FunctionDevelopment functionDevelopment = new FunctionDevelopment();
		System.out.println(Arrays.toString(functionDevelopment.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));  // [2, 1]
		System.out.println(Arrays.toString(functionDevelopment.solution(new int[]{1, 1, 1, 1}, new int[]{100, 50, 99, 100}))); // [1, 3]
	}
}
