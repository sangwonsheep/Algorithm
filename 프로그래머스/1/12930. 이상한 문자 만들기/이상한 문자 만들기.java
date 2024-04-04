class Solution {
    public String solution(String s) {
        String[] str = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x < str.length; x++) {
            String word = str[x];
            for(int i = 0; i < word.length(); i++) {
                if(i % 2 == 0)
                    sb.append(Character.toUpperCase(word.charAt(i)));
                else
                    sb.append(Character.toLowerCase(word.charAt(i)));
            }
            if(x < str.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}