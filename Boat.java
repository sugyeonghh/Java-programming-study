// 프로그래머스 - 구명보트

import java.util.Arrays;

public class Boat {
	public int solution(int[] people, int limit) {
		int count = 0;
		int left = 0;
		int right = people.length - 1;

		Arrays.sort(people);
		while(left <= right) {
			if (people[left] + people[right] <= limit) left++;
			count++;
			right--;
		}
		return count;
	}

	public static void main(String[] args) {
		Boat boat = new Boat();
		System.out.println(boat.solution(new int[]{70, 50, 80, 50}, 100));
		System.out.println(boat.solution(new int[]{70, 80, 50}, 100));
	}
}
