class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int convertCount = 0;
        int zeroCount = 0;
        
        while(!s.equals("1")){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '1'){
                    sb.append(c);
                }
                else {
                    zeroCount++;
                }
            }
            s = Integer.toString(sb.length(), 2);
            convertCount++;
        }
        answer[0] = convertCount;
        answer[1] = zeroCount;
        
        return answer;
    }
}