// 유한소수 판별하기

public class FiniteDecimal {
    public int solution(int a, int b) {
        for (int n = b; n > 0; n--) {
            if (a % n == 0 && b % n == 0) {
                a /= n;
                b /= n;
            }
        }

       while (b > 1) {
           if (b % 2 == 0) b /= 2;
           else if (b % 5 == 0) b /= 5;
           else return 2;
       }
       return 1;
    }

    public static void main(String[] args) {
        FiniteDecimal finiteDecimal = new FiniteDecimal();
        System.out.println("a: 7, b: 20 인 경우: " + finiteDecimal.solution(7, 20));
        System.out.println("a: 11, b: 22 인 경우: " + finiteDecimal.solution(11, 22));
        System.out.println("a: 12, b: 21 인 경우: " + finiteDecimal.solution(12, 21));
        System.out.println("a: 25, b: 30 인 경우: " + finiteDecimal.solution(25, 30));
    }
}
