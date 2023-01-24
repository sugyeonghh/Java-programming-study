// 프로그래머스 - 뉴스 클러스터링

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewsClustering {
	public int solution(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		Set<String> set = new HashSet<>();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		for (int i = 0; i < arr1.length - 1; i++) {
			if (Character.isAlphabetic(arr1[i]) && Character.isAlphabetic(arr1[i + 1])) {
				String tmp = "" + arr1[i] + arr1[i + 1];
				map1.put(tmp, map1.getOrDefault(tmp, 0) + 1);
				set.add(tmp);
			}
		}
		for (int i = 0; i < arr2.length - 1; i++) {
			if (Character.isAlphabetic(arr2[i]) && Character.isAlphabetic(arr2[i + 1])) {
				String tmp = "" + arr2[i] + arr2[i + 1];
				map2.put(tmp, map2.getOrDefault(tmp, 0) + 1);
				set.add(tmp);
			}
		}

		int total = 0;
		for (String s : set) {
			total += Math.max(map1.getOrDefault(s, 0), map2.getOrDefault(s, 0));
		}

		int intersection = 0;
		for (String s : map1.keySet()) {
			if (map2.containsKey(s))
				intersection += Math.min(map1.get(s), map2.get(s));
		}

		double result = total == 0 ? 1 : (double)intersection / (double)total;
		return (int)(result * 65536);
	}

	public static void main(String[] args) {
		NewsClustering newsClustering = new NewsClustering();
		System.out.println(newsClustering.solution("FRANCE", "french"));
		System.out.println(newsClustering.solution("handshake", "shake hands"));
		System.out.println(newsClustering.solution("aa1+aa2", "AAAA12"));
	}
}
