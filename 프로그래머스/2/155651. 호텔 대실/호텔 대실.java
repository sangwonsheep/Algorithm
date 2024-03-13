import java.util.*;

class Solution {
    public static int solution(String[][] book_time) {
        int[][] in_out = new int[book_time.length][2];
        
        Arrays.sort(book_time, (x, y) -> x[0].compareTo(y[0])); // 입실 시간 기준 정렬
        PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> x[1]-y[1]); // 퇴실 시간 기준 정렬

        for(int i = 0; i < book_time.length; i++) {
            for(int j = 0; j < 2; j++) {
                String[] time = book_time[i][j].split(":");
                in_out[i][j] = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            }

            if(queue.isEmpty()) {
                queue.offer(in_out[i]);
                continue;
            }

            int[] poll = queue.poll();

            int in = in_out[i][0]; // 입실 시간
            int out = poll[1] + 10; // 퇴실 시간

            if(in >= out){
                queue.offer(in_out[i]);
            }
            else {
                queue.offer(poll);
                queue.offer(in_out[i]);
            }

        }

        return queue.size();
    }
}