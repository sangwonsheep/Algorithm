class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        for(int i = 0; i < n; i++) {
            if((a+1) == b || (b+1) == a) {
                if((a / 2) + (a % 2) == (b / 2) + (b % 2)){
                    answer++;
                    break;
                }
            }
            a = (a / 2) + (a % 2);
            b = (b / 2) + (b % 2);
            answer++;
        }
        return answer;
    }
}