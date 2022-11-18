// 프로그래머스 - 삼각형의 완성조건(2)

import java.util.stream.IntStream;

public class Triangle2 {
    public int solution(int[] sides) {
        int longer = Math.max(sides[0], sides[1]);
        int shorter = Math.min(sides[0], sides[1]);

        return (int)IntStream.range(longer-shorter+1, longer+shorter).count();
    }

    public static void main(String[] args) {
        Triangle2 triangle2 = new Triangle2();
        System.out.println(triangle2.solution(new int[]{1, 2}));    // 1
        System.out.println(triangle2.solution(new int[]{3, 6}));    // 5
        System.out.println(triangle2.solution(new int[]{11, 7}));   // 13
    }
}
