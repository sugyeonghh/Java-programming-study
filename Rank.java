// 프로그래머스 - 등수 매기기

import java.util.*;

public class Rank {
    public int[] solution(int[][] score) {
	    ArrayList<Integer> scoreList = new ArrayList<>();
		for (int[] s : score) {
			scoreList.add(s[0] + s[1]);
		}
		scoreList.sort(Comparator.reverseOrder());
		int[] result = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			result[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
		}
		return result;
    }

    public static void main(String[] args) {
        Rank rank = new Rank();
        int[][] score1 = new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score2 = new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(rank.solution(score1)));     // [1, 2, 4, 3]
        System.out.println(Arrays.toString(rank.solution(score2)));     // [4, 4, 6, 2, 2, 1, 7]
    }
}
