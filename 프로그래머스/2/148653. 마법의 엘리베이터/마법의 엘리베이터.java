class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            int remain = storey % 10;
            if(remain > 5) {
                storey += (10 - remain);
                answer += (10 - remain);
            }
            
            // 10의 자리가 5이상이면 10의 자리를 하나 더 늘려야 버튼 횟수를 한 번 줄일 수 있음.
            else if(remain == 5){
                if(storey % 100 >= 50){
                    storey += remain; // storey += 10; 이 코드로 해도 상관없음.
                }
                answer += remain;
            }
            else {
                answer += remain;
            }
            storey /= 10;
        }
        return answer;
    }
}