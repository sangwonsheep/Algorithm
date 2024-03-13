class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            int remain = storey % 10;
            if(remain > 5) {
                storey += (10 - remain);
                answer += (10 - remain);
            }
            
            // 1의 자리 수가 5일 경우 2가지로 처리해주셔야 합니다.
            // 10의 자리가 5이상이면 10 추가해주셔야 하고 아니라면 감소시켜주셔야 합니다.
            else if(remain == 5){
                if(storey % 100 >= 50){
                    storey += 10;
                }
                answer += remain;
            }
            else {
                answer += remain;
            }
            System.out.println(storey + " " + remain + " " + answer);
            storey /= 10;
            
        }
        return answer;
    }
}