public class ChickenCoupon {
	public int solution(int chicken) {
		int last = chicken % 10;
		int count = chicken / 10;
		chicken /= 10;

		while (chicken > 0) {
			last += chicken % 10;
			count += chicken / 10;
			chicken /= 10;
		}
		return count + last/10;
	}

	public static void main(String[] args) {
		ChickenCoupon chickenCoupon = new ChickenCoupon();
		System.out.println(chickenCoupon.solution(100));    // 11
		System.out.println(chickenCoupon.solution(1081));    // 120
		System.out.println(chickenCoupon.solution(1999));    // 222

		/*
		* 1999 -> 1999장 -> 199마리, 9장
		* 199 -> 199장 -> 19마리, 9장
		* 19 -> 19장 -> 1마리, 9장
		* 1마리 -> 1장 -> 1장
		* 9장 + 9장 + 9장 + 1장 = 28장
		* 28 -> 2마리
		* 199+19+1+2 = 221마리
		* */

	}
}
