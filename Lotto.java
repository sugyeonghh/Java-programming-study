// 프로그래머스 - 로또의 최고 순위와 최저 순위

import java.util.Arrays;

public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] rank = {6, 6, 5, 4, 3, 2, 1};
		int zeroCnt = (int)Arrays.stream(lottos).filter(l -> l == 0).count();
		int winCnt = (int)Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w == l)).count();
		return new int[]{rank[winCnt + zeroCnt], rank[winCnt]};
	}

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		System.out.println(Arrays.toString(lotto.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));   // [3, 5]
		System.out.println(Arrays.toString(lotto.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));    // [1, 6]
		System.out.println(Arrays.toString(lotto.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));    // [1, 1]
	}
}
