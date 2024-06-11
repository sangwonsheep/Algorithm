import java.util.*;

class Solution {
    
    private static final char[] VOWELS = "AEIOU".toCharArray();
    
    public int solution(String word) {
        List<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }
    
    public void generate(String word, List<String> words) {
        words.add(word);
        if(word.length() == 5)
            return;
        
        for(char c : VOWELS) {
            generate(word+c, words);
        }
    }
}