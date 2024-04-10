class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase(); // 1
        answer = answer.replaceAll("[^a-z0-9\\-_.]", ""); // 2
        answer = answer.replaceAll("\\.+", "."); // 3
        answer = answer.replaceAll("^\\.|\\.$", ""); // 4
        
        if(answer.isEmpty()) {
            answer += "a"; // 5
        }
        
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", ""); // 6
        }
        
        while(answer.length() < 3) { 
            answer += answer.charAt(answer.length()-1); // 7
        }
        
        return answer;
    }
}