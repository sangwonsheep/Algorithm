import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 동영상 길이
        StringTokenizer st = new StringTokenizer(video_len, ":");
        int videoMinute = Integer.parseInt(st.nextToken());
        int videoSecond = Integer.parseInt(st.nextToken());
        int video = minuteToSecond(videoMinute, videoSecond);
        
        // 동영상 재생 위치
        st = new StringTokenizer(pos, ":");
        int startMinute = Integer.parseInt(st.nextToken());
        int startSecond = Integer.parseInt(st.nextToken());
        int start = minuteToSecond(startMinute, startSecond);
        
        // 오프닝 시작 시간
        st = new StringTokenizer(op_start, ":");
        int opStartMinute = Integer.parseInt(st.nextToken());
        int opStartSecond = Integer.parseInt(st.nextToken());
        int opStart = minuteToSecond(opStartMinute, opStartSecond);
        
        // 오프닝 종료 시간
        st = new StringTokenizer(op_end, ":");
        int opEndMinute = Integer.parseInt(st.nextToken());
        int opEndSecond = Integer.parseInt(st.nextToken());
        int opEnd = minuteToSecond(opEndMinute, opEndSecond);
        
        if (opStart <= start && start <= opEnd) {
            startMinute = opEndMinute;
            startSecond = opEndSecond;
        }
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                startSecond += 10;
                if (startSecond >= 60) {
                    startMinute += 1;
                    startSecond -= 60;
                }
                start = minuteToSecond(startMinute, startSecond);
                if (start > video) {
                    startMinute = videoMinute;
                    startSecond = videoSecond;
                }

            }
            else {
                startSecond -= 10;
                if (startSecond < 0) {
                    startMinute -= 1;
                    startSecond += 60;
                }
                if (startMinute < 0) {
                    startMinute = 0;
                    startSecond = 0;
                }
            }
            
            start = minuteToSecond(startMinute, startSecond);
           
            if (opStart <= start && start <= opEnd) {
                startMinute = opEndMinute;
                startSecond = opEndSecond;
            }
        }
        
        return String.format("%02d", startMinute) + ":" + String.format("%02d", startSecond);
    }
                
    public int minuteToSecond(int minute, int second) {
        return minute * 60 + second;
    }

}