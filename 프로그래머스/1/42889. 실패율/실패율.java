import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        List<Integer> list = new ArrayList<>();      
        double[] rates = new double[N];
        
        for(int i = 0; i < N; i++) {
            int stage = 0;
            int fail = 0;
            for(int j = 0; j < stages.length; j++) {
                // 각 stage 별 도달한 인원
                if(stages[j] >= (i+1)){
                    stage++;
                }
                // 각 stage 별 클리어하지 못한 인원
                if(stages[j] == (i+1)){
                    fail++;
                }
            }
            // 0으로 나누면 infinity 값이 들어가므로 0 처리
            rates[i] = (fail == 0) ? 0 : (double) fail / stage;
        }

        int[] answer = new int[N];
        
        for(int i = 0; i < N; i++) {
            int maxIndex = 0;
            for(int j = 1; j < N; j++) {
                if(rates[j] > rates[maxIndex]) {
                    maxIndex = j;
                }
            }
            answer[i] = maxIndex+1;
            rates[maxIndex] = -1;
        }
    
        return answer;
    }
}