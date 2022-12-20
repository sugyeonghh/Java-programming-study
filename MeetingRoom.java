// 백준 - 1931 회의실 배정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MeetingRoom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ArrayList<int[]> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] read = br.readLine().split(" ");
			int start = Integer.parseInt(read[0]);
			int end = Integer.parseInt(read[1]);
			list.add(new int[]{start, end});
		}

		list.sort((o1, o2) -> {
			if (o1[1] == o2[1]) return o1[0] - o2[0];
			return o1[1] - o2[1];
		});
		int count = 0;
		int end = 0;
		for (int[] ints : list) {
			if (end <= ints[0]) {
				end = ints[1];
				count += 1;
			}
		}
		System.out.println(count);
	}
}
