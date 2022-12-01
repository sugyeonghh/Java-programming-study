// 프로그래머스 - 치킨 쿠폰

public class ChickenCoupon {
	public int solution(int chicken) {
		int coupon = chicken;
		int count = 0;

		while (coupon >= 10) {
			int leftCoupon = coupon % 10;
			count += coupon / 10;
			coupon = leftCoupon + coupon / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		ChickenCoupon chickenCoupon = new ChickenCoupon();
		System.out.println(chickenCoupon.solution(100));    // 11
		System.out.println(chickenCoupon.solution(1081));    // 120
		System.out.println(chickenCoupon.solution(1999));    // 222
	}
}
