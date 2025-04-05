class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.length; i++) {
            boolean isLate = false;
            int day = startday;
            for (int j = 0; j < 7; j++) {
                if (day > 7) {
                    day = 1;
                }
                if (day != 6 && day != 7) {
                    int schedule = schedules[i] + 10;
                    if (schedule % 100 >= 60) {
                        schedule += (100 - 60); // 시 자릿수 올리기
                    }
                    int time = timelogs[i][j];
                    
                    if (schedule < time) {
                        isLate = true;
                        break;
                    }
                }
                day++;
            }
            if (!isLate) {
                answer++;
            }
        }            
        return answer;
    }
}