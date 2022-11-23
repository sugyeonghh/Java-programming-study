// 다트 게임

import java.util.Stack;

public class DartGame {
    public int solution(String dartResult) {
        Stack<Integer> result = new Stack<>();
        for (int i = 0; i < dartResult.length(); i++) {
            char dart = dartResult.charAt(i);
            if (dart >= '0' && dart <= '9') {
                if (i > 0 && dartResult.charAt(i - 1) >= '0' && dartResult.charAt(i - 1) <= '9') result.push(result.pop() * 10 + dart - '0');
                else result.push(dart - '0');
            }
            else if (dart == 'S') ;
            else if (dart == 'D') result.push((int)Math.pow(result.pop(), 2));
            else if (dart == 'T') result.push((int)Math.pow(result.pop(), 3));
            else if (dart == '*') {
                int last = result.pop() * 2;
                if (!result.isEmpty()) {
                    int first = result.pop() * 2;
                    result.push(first);
                }
                result.push(last);
            }
            else if (dart == '#') result.push(result.pop() * -1);
        }
        return result.stream().mapToInt(r -> r).sum();
    }

    public static void main(String[] args) {
        DartGame dartGame = new DartGame();
        System.out.println(dartGame.solution("1S2D*3T"));   // 37
        System.out.println(dartGame.solution("1D2S#10S"));   // 9
        System.out.println(dartGame.solution("1D2S0T"));   // 3
        System.out.println(dartGame.solution("1S*2T*3S"));   // 23
        System.out.println(dartGame.solution("1D#2S*3S"));   // 5
        System.out.println(dartGame.solution("1T2D3D#"));   // -4
        System.out.println(dartGame.solution("1D2S3T*"));   // 59
    }
}
