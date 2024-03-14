import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> list = new ArrayList<>();
        getCollatz(list, k);
        
        int n = list.size() - 1;
        
        for(int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = n + ranges[i][1];
            
            if(start > end) {
                answer[i] = -1;
                continue;
            }
            
            double sum = 0;
            
            for(int j = start; j < end; j++) {
               sum += (list.get(j) + list.get(j+1)) / 2.0;
            }
            answer[i] = sum;
        }
    
        return answer;
    }
    
    public void getCollatz(List<Integer> list, int k) {
        while(k != 1){
            list.add(k);
            if(k % 2 == 0) 
                k /= 2;
            else
                k = k * 3 + 1;
        }
        list.add(k);
    }
}