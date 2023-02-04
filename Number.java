// 프로그래머스 - 숫자의 표현

public class Number {
	public int solution(int n) {
		int result = 0;
		int sum = 0;

		for (int i = 1; ; i++) {
			sum += i;
			if (sum > n) break;
			if ((n - sum) % i == 0) result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Number number = new Number();
		System.out.println(number.solution(21)); // 4
	}
}

/*
*        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15   ... 21
* i = 1  1 1 1 1 1 1 1 1 1  1  1  1  1  1  1
*     2      1   1   1   1     1     1     1
*     3            1     1        1        1
*     4                     1           1
*     5                                    1
*     6                                        ...  1
*
* -> 첫 번째 항: (1 ~ i) 누적 합
* -> 등차 : i
* */