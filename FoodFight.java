// 프로그래머스 - 푸드 파이트 대회

public class FoodFight {
	public String solution(int[] food) {
		String result = "";
		for (int i = 1; i < food.length; i++) {
			result += String.valueOf(i).repeat(food[i] / 2);
		}
		String reversed = new StringBuffer(result).reverse().toString();
		return result + "0" + reversed;
	}

	public static void main(String[] args) {
		FoodFight foodFight = new FoodFight();
		System.out.println(foodFight.solution(new int[]{1, 3, 4, 6}));  // "1223330333221"
		System.out.println(foodFight.solution(new int[]{1, 7, 1, 2}));  // "111303111"
	}
}
