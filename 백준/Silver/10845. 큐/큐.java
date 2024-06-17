import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.contains("push")){
                int p = Integer.parseInt(st.nextToken());
                queue.offer(p);
                continue;
            }

            if(s.equals("pop")){
                if(queue.isEmpty()){
                    sb.append("-1");
                }
                else {
                    sb.append(queue.poll());
                }
            }
            else if(s.equals("size")){
                sb.append(queue.size());
            }
            else if(s.equals("empty")) {
                if(queue.isEmpty()) {
                    sb.append("1");
                }
                else {
                    sb.append("0");
                }
            }
            else if(s.equals("front")) {
                if(queue.isEmpty()) {
                    sb.append("-1");
                }
                else {
                    sb.append(queue.peek());
                }
            }
            else if(s.equals("back")) {
                if(queue.isEmpty()) {
                    sb.append("-1");
                }
                else
                    sb.append(queue.peekLast());
            }
            System.out.println(sb);
        }
    }
}