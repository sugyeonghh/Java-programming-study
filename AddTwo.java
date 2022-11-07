// 프로그래머스 - 두 개 뽑아서 더하기
/* 풀이)
 * 1. for문 중첩해서 요소 하나하나에 접근
 * 2. 요소 두 개를 더한 값을 sum에 저장
 * 3. 길이가 (answer 배열의 길이 + 1) 배열 할당 후 answer 복사
 * 4. answer 배열에 sum 넣어줌 -> answer에 sum이 없을 때만!
 * */

import java.util.Arrays;

public class AddTwo {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                boolean isContain = false;
                for (int a : answer) {
                    if (a == sum) {
                        isContain = true;
                        break;
                    }
                }
                if (!isContain) {
                    answer = Arrays.copyOf(answer, answer.length + 1);
                    answer[answer.length - 1] = sum;
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        // 두 개 뽑아서 더하기
        AddTwo addTwo = new AddTwo();
        int[][] input3 = {{2,1,3,4,1}, {5,0,2,7}};
        int[][] result3 = {{2,3,4,5,6,7}, {2,5,7,9,12}};
        System.out.println("두 개 뽑아서 더하기");
        for (int i = 0; i < input3.length; i++) {
            System.out.printf("example %d", i+1);
            System.out.println("=".repeat(20));
            System.out.println("input: " + Arrays.toString(input3[i]));
            System.out.println("correct: " + Arrays.toString(result3[i]));
            System.out.println("my answer: " + Arrays.toString(addTwo.solution(input3[i])));
        }
    }
}
