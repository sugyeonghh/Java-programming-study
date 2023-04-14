// 프로그래머스 - 땅따먹기

import java.util.Arrays;

public class Land {
//    boolean[][] visited;
//    int result = 0;
//
//    int solution(int[][] land) {
//        visited = new boolean[land.length][land[0].length];
//        dfs(land, 0, -1, 0);
//
//        return result;
//    }
//
//    private void dfs(int[][] land, int i, int before, int sum) {
//        for (int j = 0; j < land[0].length; j++) {
//            if (i < land.length && !visited[i][j] && before != j) {
//                visited[i][j] = true;
//                dfs(land, i + 1, j, sum + land[i][j]);
//                visited[i][j] = false;
//            }기
//        }
//        result = Math.max(result, sum);
//    }

    int solution(int[][] land) {
        int size = land.length;

        for (int i = 1; i < size; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        return Arrays.stream(land[size - 1]).max().getAsInt();
    }

    public static void main(String[] args) {
        Land land = new Land();
        System.out.println(land.solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
    }
}
