import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int n = people.length;
        Arrays.sort(people);

        int i = 0; // 맨 앞
        int j = n - 1; // 맨 뒤

        while (i < j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
                answer++;
            }
            else {
                j--;
                answer++;
            }
        }

        if(i == j)
            answer++;
        
        return answer;
    }
}
