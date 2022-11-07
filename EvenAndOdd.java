// 프로그래머스 - 짝수와 홀수

public class EvenAndOdd {
    public String solution(int num) {
        return (num%2 == 0 ? "Even" : "Odd");
    }

    // main for 짝수와 홀수
    public static void main(String[] args) {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        int[] input1 = {3, 4};
        String[] result1 = {"Odd", "Even"};
        System.out.println("짝수와 홀수");
        for (int i = 0; i < input1.length; i++) {
            System.out.printf("example %d", i + 1);
            System.out.println("=".repeat(20));
            System.out.println("input: " + input1[i]);
            System.out.println("correct: " + result1[i]);
            System.out.println("my answer: " + evenAndOdd.solution(input1[i]));
        }
    }
}

