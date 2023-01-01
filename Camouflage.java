import java.util.HashMap;

public class Camouflage {
	public int solution(String[][] clothes) {
		HashMap<String, Integer> wear = new HashMap<>();
		int result = 0;
		for (String[] cloth : clothes) {
			wear.put(cloth[1], wear.getOrDefault(cloth[1], 0) + 1);
			result += 1;
		}

	}

	public static void main(String[] args) {
		Camouflage camouflage = new Camouflage();
		System.out.println(camouflage.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));  // 5
		System.out.println(camouflage.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));  // 3
	}
}