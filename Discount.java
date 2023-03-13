// 프로그래머스 - 할인 행사

import java.util.*;

public class Discount {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        List<String> wants = new ArrayList<>();

        for (int i = 0; i < want.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                wants.add(want[i]);
            }
        }
        wants.sort(Comparator.naturalOrder());
        String[] wantList = wants.toArray(new String[0]);

        for (int i = 0; i <= discount.length - 10; i++) {
            List<String> range = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(discount, i, i + 10)));
            range.sort(Comparator.naturalOrder());
            String[] rangeList = range.toArray(new String[0]);

            if (Arrays.equals(wantList, rangeList)) result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Discount discount = new Discount();
        System.out.println(discount.solution(
                new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}
