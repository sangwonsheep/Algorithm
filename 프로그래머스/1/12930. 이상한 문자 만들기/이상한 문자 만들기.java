class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        
        for(char c : s.toCharArray()) {
            if(!Character.isAlphabetic(c)) {
                sb.append(c);
                check = true;
            }
            else {
                if(check){
                    sb.append(Character.toUpperCase(c));
                }
                else{
                    sb.append(Character.toLowerCase(c));
                }
                check = !check;    
            }
        }
        return sb.toString();
    }
}