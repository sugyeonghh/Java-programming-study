// 프로그래머스 - 소수 만들기

public class MakePrime {
    public int solution(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len - 2; i++)
            for (int j = i + 1; j < len - 1; j++)
                for (int k = j + 1; k < len; k++)
                    if (isPrime(nums[i] + nums[j] + nums[k])) count++;
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
        MakePrime makePrime = new MakePrime();
        System.out.println(makePrime.solution(new int[]{1, 2, 3, 4}));      // 1
        System.out.println(makePrime.solution(new int[]{1, 2, 7, 6, 4}));   // 4
    }
}
