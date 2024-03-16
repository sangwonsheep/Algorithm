class Solution {
    
    boolean[] visited;
    int answer;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }

    public void dfs(String begin, String target, String[] words, int count) {
        if(begin.equals(target)) {
            answer = count;
            return;
        }

        for(int i = 0; i < words.length; i++) {
            if(visited[i])
                continue;

            int check = 0;
            for(int j = 0; j < words[i].length(); j++) {
                if(begin.charAt(j) == words[i].charAt(j)){
                    check++;
                }
            }

            // 글자 하나 빼고 모두 같은 경우
            // true -> false 이유는 모든 경우의 수를 탐색하기 위함
            if(check == words[i].length() - 1) {
                visited[i] = true;
                dfs(words[i], target, words, count+1);
                visited[i] = false;
            }
        }
    }
}