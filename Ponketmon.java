// 프로그래머스 - 폰켓몬

import java.util.HashSet;

public class Ponketmon {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums)
            hashSet.add(n);
        return hashSet.size() >= nums.length/2 ? nums.length/2 : hashSet.size();
    }

    public static void main(String[] args) {
        Ponketmon pockenmon = new Ponketmon();

        System.out.println(pockenmon.solution(new int[]{3, 1, 2, 3}));      // 2
        System.out.println(pockenmon.solution(new int[]{3,3,3,2,2,4}));     // 3
        System.out.println(pockenmon.solution(new int[]{3,3,3,2,2,2}));     // 2
    }
}
