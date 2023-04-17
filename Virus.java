// 백준 - 2606 바이러스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Virus {
    static int count = 0;
    private static void dfs(int[][] graph, boolean[] visited, int vertex, int start) {
        visited[start] = true;
        count++;
        for (int i = 1; i < vertex + 1; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfs(graph, visited, vertex, i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertex = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        int[][] graph = new int[vertex + 1][vertex + 1];
        boolean[] visited = new boolean[vertex + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int to = Integer.parseInt(token.nextToken());
            int from = Integer.parseInt(token.nextToken());
            graph[to][from] = graph[from][to] = 1;
        }

        dfs(graph, visited, vertex, 1);
        System.out.println(count - 1);
    }
}
