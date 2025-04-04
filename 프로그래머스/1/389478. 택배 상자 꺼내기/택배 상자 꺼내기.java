class Solution {
    public int solution(int n, int w, int num) { // n : 총 박스 수, w : 한 층에 필요한 박스, num : 꺼내기
        int answer = 0;
        int nextNumber = num;
        while (nextNumber <= n) {
            nextNumber += nextNumber % w == 0 ? 1 : (w - (nextNumber % w)) * 2 + 1;
            answer++;
        }
        
        return answer;
    }
}