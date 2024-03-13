class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        for(int x = 0; x <= d; x += k) {
            int y = (int)Math.sqrt((long)Math.pow(d, 2) - (long)Math.pow(x, 2));
            answer += (y / k) + 1;
        }
        
        return answer;
    }
}