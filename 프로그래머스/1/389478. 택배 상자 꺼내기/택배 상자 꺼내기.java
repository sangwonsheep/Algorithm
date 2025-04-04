class Solution {
    public int solution(int n, int w, int num) { // n : 총 박스 수, w : 한 층에 필요한 박스, num : 꺼내기
        int answer = 0;
        int nextNumber = num;
        int floor = num % w == 0 ? num / w - 1 : num / w;
        while (nextNumber <= n) {
            nextNumber += nextNumber % w == 0 ? 1 : (w - (nextNumber % w)) * 2 + 1;
            answer++;
        }
        
        return answer;
    }
}