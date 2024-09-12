import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 수빈이는 동생과 숨바꼭질을 하고 있다. 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다.
 * 수빈이는 걷거나 순간이동을 할 수 있다.
 * 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.
 * 수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
 */
public class Main {

    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        System.out.println(bfs(n, k));
    }

    public static int bfs(int n, int k) {
        if(n == k)
            return 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = 1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if(i == 0) next = cur - 1;
                else if(i == 1) next = cur + 1;
                else next = cur * 2;

                if(next == k)
                    return visited[cur];

                if(next < 0 || next > 100000) continue;
                if(visited[next] != 0) continue;

                queue.offer(next);
                visited[next] = visited[cur] + 1;
            }
        }
        return 0;
    }

}
