// 프로그래머스 - 예상 대진표

public class Tournament {
	public int solution(int n, int a, int b) {
		int count = 0;
		a--;
		b--;

		while (a != b) {
			a /= 2;
			b /= 2;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Tournament tournament = new Tournament();
		System.out.println(tournament.solution(8, 4, 7));
	}
}
