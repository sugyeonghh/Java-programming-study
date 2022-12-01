// 프로그래머스 - 콜라 문제

public class Coke {
    public int solution(int a, int b, int n) {
        int count = 0;
		int num = n;

        while(num >= a) {
            count += num / a * b;
            num = num / a * b + num % a;
        }
		return count;
    }

    public static void main(String[] args) {
        Coke coke = new Coke();
        System.out.println(coke.solution(2, 1, 20));    // 19
        System.out.println(coke.solution(3, 1, 20));    // 9
    }
}
