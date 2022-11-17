// 프로그래머스 - 실패율

import java.util.*;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = i + 1;
            long total = Arrays.stream(stages).filter(v -> v >= key).count();
            long fail = Arrays.stream(stages).filter(v -> v == key).count();
            map.put(key, total == 0 ? 0 : (double)fail/total);      // 스테이지에 도전한 사람이 없는 경우 실패율 0
        }

        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (k1, k2) -> (map.get(k2).compareTo(map.get(k1)))); // 내림차순 정렬
        return keySetList.stream().mapToInt(k -> k).toArray();
    }

    public static void main(String[] args) {
        FailureRate failureRate = new FailureRate();
        Arrays.stream(failureRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}))   // [3, 4, 2, 1, 5,]
                .forEach(a -> System.out.print(a + " "));
        System.out.println();
        Arrays.stream(failureRate.solution(4, new int[]{4, 4, 4, 4, 4}))            // [4, 1, 2, 3]
                .forEach(a -> System.out.print(a + " "));
        System.out.println();
        Arrays.stream(failureRate.solution(5, new int[]{3, 3, 3}))                  // [3, 1, 2, 4 ,5]
                .forEach(a -> System.out.print(a + " "));

    }
}
