import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i < s.length()-1; i++) {
            StringBuilder sb = new StringBuilder();
            List<String> split = new ArrayList();
            for(int j = 0; j < s.length(); j += (i+1)) {
                int lastIndex = (j+i+1);
                if(lastIndex > s.length()){
                    lastIndex = s.length();
                }
                split.add(s.substring(j, lastIndex));
            }
            
            int count = 1;
            for(int j = 0; j < split.size()-1; j++) {
                if(split.get(j).equals(split.get(j+1))){
                    count++;
                    if(j == split.size()-2){
                        sb.append(count + split.get(j));
                    }
                }
                else {
                    if(count > 1){
                        sb.append(count + split.get(j));
                        if(j == split.size()-2) {
                            sb.append(split.get(j+1));
                        }
                    }
                    else {
                        sb.append(split.get(j));
                        if(j == split.size()-2) {
                            sb.append(split.get(j+1));
                        }
                    }
                    count = 1;
                }
            }
            
            answer = Math.min(answer, sb.length());
            // System.out.println(sb.toString());
        }
        if(s.length() == 1)
            return 1;
        return answer;
    }
}