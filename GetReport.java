// 프로그래머스 - 신고 결과 받기

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class GetReport {
	public int[] solution(String[] id_list, String[] report, int k) {
		HashMap<String, HashSet<String>> reporter = new HashMap<>();
		HashMap<String, HashSet<String>> reported = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			reporter.put(id_list[i], new HashSet<>());
			reported.put(id_list[i], new HashSet<>());
		}

		for (String r : report) {
			String reporterInfo = r.split(" ")[0];
			String reportedInfo = r.split(" ")[1];
			reporter.get(reporterInfo).add(reportedInfo);
			reported.get(reportedInfo).add(reporterInfo);
		}

		int[] result = new int[id_list.length];
		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reporterHashset = reporter.get(id_list[i]);
			for (String hashset : reporterHashset) {
				if (reported.get(hashset).size() >= k) {
					result[i]++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		GetReport getEmail = new GetReport();
		System.out.println(Arrays.toString(getEmail.solution(
				new String[]{"muzi", "frodo", "apeach", "neo"},
				new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));  // [2, 1, 1, 0]
		System.out.println(Arrays.toString(getEmail.solution(
				new String[]{"con", "ryan"},
				new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3))); // [0, 0]
	}
}
