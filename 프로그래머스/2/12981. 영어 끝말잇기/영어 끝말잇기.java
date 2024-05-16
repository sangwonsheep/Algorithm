import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet <String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
            // 한 글자인 경우
            if(words.length <= 1)
                return answer;
            
            // 중복되는 단어가 있는 경우
            // 앞사람의 맨끝 글자와 뒷사람의 맨앞 글자가 다른 경우
            if(set.contains(words[i]) || 
               words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
            {
                // 가장 먼저 탈락한 사람 번호
                answer[0] = i % n + 1;
                // 탈락한 시점
                answer[1] = i / n + 1;
                return answer;
            }
            // 규칙을 지킨 경우
            else
                set.add(words[i]);
        }
        // 규칙을 모두 지킨 경우(탈락자가 없음)
        return answer;
    }
}