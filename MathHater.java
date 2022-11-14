// 프로그래머스 - 수포자

import java.util.ArrayList;
import java.util.Arrays;

public class MathHater {
    public int[] solution(int[] answers) {
        int len = answers.length;
        ArrayList<Integer> p1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> p2 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        ArrayList<Integer> p3 = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        int[] collect = new int[]{0, 0, 0};

        for (int i = 0; i < len; i++) {
            if (answers[i] == p1.get(i % p1.size())) collect[0] += 1;
            if (answers[i] == p2.get(i % p2.size())) collect[1] += 1;
            if (answers[i] == p3.get(i % p3.size())) collect[2] += 1;
        }
        int max = Arrays.stream(collect).max().getAsInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            if (collect[i] == max) result.add(i + 1);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        MathHater mathHater = new MathHater();

        System.out.println(mathHater.solution(new int[]{1, 2, 3, 4, 5}));   // 1
        System.out.println(mathHater.solution(new int[]{1, 3, 2, 4, 2}));   // 1, 2, 3
    }
}
