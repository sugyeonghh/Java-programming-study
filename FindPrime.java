// 프로그래머스 - 소수 찾기

public class FindPrime {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                count++;
        return count;
    }

    private boolean isPrime(int n) {
        if (n == 2) return true;
        else if (n == 1 || n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        System.out.println(findPrime.solution(10)); // 4
        System.out.println(findPrime.solution(5));  // 3
    }
}
