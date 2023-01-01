// 프로그래머스 - 방문 길이

import java.util.*;

public class VisitedLength {
	public int solution(String dirs) {
		int size = 5;
		HashMap<String, int[]> UDRL = new HashMap<>(){};
		UDRL.put("U", new int[]{0, 1});
		UDRL.put("D", new int[]{0, -1});
		UDRL.put("R", new int[]{1, 0});
		UDRL.put("L", new int[]{-1, 0});

		List<String> visited = new ArrayList<>();

		int x = 0;
		int y = 0;
		for (String direction : dirs.split("")) {
			int nx = x + UDRL.get(direction)[0];
			int ny = y + UDRL.get(direction)[1];

			if (Math.abs(nx) <= size && Math.abs(ny) <= size) {
				String from = "" + x + y;
				String to = "" + nx + ny;

				if (!visited.contains(from + to)) {
					visited.add(from + to);
					visited.add(to + from);
				}
				x = nx;
				y = ny;
			}
		}
		return visited.size() / 2;
	}

	public static void main(String[] args) {
		VisitedLength visitedLength = new VisitedLength();
		System.out.println(visitedLength.solution("ULURRDLLU"));    // 7
		System.out.println(visitedLength.solution("LULLLLLLU"));    // 7
	}
}
