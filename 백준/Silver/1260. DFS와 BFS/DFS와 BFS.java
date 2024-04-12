import java.util.*;

public class Main {

    static boolean[][] graph;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int v = input.nextInt();

        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            graph[a][b] = true;
            graph[b][a] = true;
        }
        dfs(n, v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(n, v);
    }

    public static void dfs(int n, int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for(int i = 1; i <= n; i++) {
            if(!visited[i] && graph[v][i]){
                dfs(n, i);
            }
        }
    }

    public static void bfs(int n, int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.offer(v);

        while(!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");

            for(int i = 1; i <= n; i++) {
                if(!visited[i] && graph[x][i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}