class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();
        for(int i = 0; i < array.length; i++) {
            sb.append(push(array[i], n));
        }
        return sb.toString();
    }
    
    public char push(char c, int n) {
        if(!Character.isAlphabetic(c))
            return c;
        
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % 26;
        return (char)(offset + position);
    }
}