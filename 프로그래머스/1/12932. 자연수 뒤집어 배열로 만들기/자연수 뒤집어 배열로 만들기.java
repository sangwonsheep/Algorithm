class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        char[] array = s.toCharArray();
        int[] answer = new int[array.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = array[i] - '0';
        }
        
        return answer;
    }
}