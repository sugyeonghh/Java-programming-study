// 백준 - DFS와 BFS

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsAndBfs {
    private static void dfs(int[][] graph, boolean[] visited, int vertex, int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i < vertex + 1; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfs(graph, visited, vertex, i);
            }
        }
    }

    private static void bfs(int[][] graph, boolean[] visited, int vertex, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + " ");
            for (int i = 1; i < vertex + 1; i++) {
                if (graph[start][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int vertex = Integer.parseInt(input[0]);
        int line = Integer.parseInt(input[1]);
        int start = Integer.parseInt(input[2]);

        boolean[] visited = new boolean[vertex + 1];
        int[][] graph = new int[vertex + 1][vertex + 1];


        for (int i = 0; i < line; i++) {
            String[] connect = sc.nextLine().split(" ");
            int to = Integer.parseInt(connect[0]);
            int from = Integer.parseInt(connect[1]);
            graph[to][from] = graph[from][to] = 1;
        }

        dfs(graph, visited, vertex, start);
        System.out.println();
        visited = new boolean[vertex + 1];
        bfs(graph, visited, vertex, start);
    }
}
/*
  0 1 2 3 4
0 0 0 0 0 0
1 0 0 1 1 1
2 0 1 0 0 1
3 0 1 0 0 1
4 0 1 1 1 0

* */