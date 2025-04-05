import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = minuteToSecond(new StringTokenizer(video_len, ":"));
        int start = minuteToSecond(new StringTokenizer(pos, ":"));
        int opStart = minuteToSecond(new StringTokenizer(op_start, ":"));
        int opEnd = minuteToSecond(new StringTokenizer(op_end, ":"));
        
        if (opStart <= start && start <= opEnd) {
            start = opEnd;
        }
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                start += 10;
                if (start > video) {
                    start = video;
                }
            }
            else {
                start -= 10;
                if (start < 0) {
                    start = 0;
                }
            }
                       
            if (opStart <= start && start <= opEnd) {
                start = opEnd;
            }
        }
        
        int minute = start / 60;
        int second = start % 60;
        
        return String.format("%02d", minute) + ":" + String.format("%02d", second);
    }
                
    public int minuteToSecond(StringTokenizer st) {
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        return minute * 60 + second;
    }

}