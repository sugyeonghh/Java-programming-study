// 프로그래머스 - 뉴스 클러스터링

import java.util.HashMap;
import java.util.Map;

public class NewsClustering {
	public int solution(String str1, String str2) {
		Map<String, Integer> map1 = getMap(str1.toLowerCase());
		Map<String, Integer> map2 = getMap(str2.toLowerCase());

		int intersection = 0;
		for (String s : map1.keySet()) {
			if (map2.containsKey(s))
				intersection += Math.min(map1.get(s), map2.get(s));
		}

		int total = 0;
		total += map1.keySet().stream().map(map1::get).mapToInt(n -> n).sum();
		total += map2.keySet().stream().map(map2::get).mapToInt(n -> n).sum();
		total -= intersection;

		double result = total == 0 ? 1 : (double)intersection / (double)total;
		return (int)(result * 65536);
	}

	private static Map<String, Integer> getMap(String str) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length() - 1; i++) {
			if (Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(i + 1))) {
				String tmp = "" + str.charAt(i) + str.charAt(i + 1);
				map.put(tmp, map.getOrDefault(tmp, 0) + 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		NewsClustering newsClustering = new NewsClustering();
		System.out.println(newsClustering.solution("FRANCE", "french"));
		System.out.println(newsClustering.solution("handshake", "shake hands"));
		System.out.println(newsClustering.solution("aa1+aa2", "AAAA12"));
	}
}
