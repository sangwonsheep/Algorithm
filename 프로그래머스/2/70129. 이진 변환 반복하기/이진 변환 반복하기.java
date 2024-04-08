class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '1'){
                    sb.append(c);
                }
                else {
                    answer[1]++;
                }
            }
            s = Integer.toString(sb.length(), 2);
            answer[0]++;
        }
        
        return answer;
    }
}