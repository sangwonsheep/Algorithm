import java.util.*;

public class Main {

    static int[][] graph;
    static boolean[] visited;
    static int n, m, v;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();
        v = input.nextInt();

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            int v1 = input.nextInt();
            int v2 = input.nextInt();

            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }
        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);
    }

    public static void dfs(int index) {
        if(visited[index])
            return;

        visited[index] = true;
        System.out.print(index + " ");
        for (int i = 1; i <= n; i++) {
            if(graph[index][i] == 1)
                dfs(i);
        }
    }

    public static void bfs(int index) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(index);
        visited[index] = true;

        while (!q.isEmpty()) {
            int vertex = q.poll();
            System.out.print(vertex + " ");

            for (int i = 1; i <= n; i++) {
                if(!visited[i] && graph[vertex][i] == 1){ // 방문, 연결 확인
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
