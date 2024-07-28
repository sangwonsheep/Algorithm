import java.util.*;

public class Main {

    static int[] graph;
    static boolean[] visited;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = input.nextInt();
            graph = new int[n+1];
            visited = new boolean[n+1];

            int result = 0;
            for (int i = 1; i <= n; i++) {
                graph[i] = input.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                if(!visited[i]) {
                    dfs(i);
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    public static void dfs(int index) {
        visited[index] = true;
        if(!visited[graph[index]]) {
            dfs(graph[index]);
        }
    }
}
