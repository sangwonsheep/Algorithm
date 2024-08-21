import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int move : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][move-1] != 0) {    
                    int picked = board[i][move-1];
                    board[i][move-1] = 0;  // 인형을 뽑았으므로 해당 자리를 0으로 설정
                    if(!stack.isEmpty() && stack.peek() == picked){
                        stack.pop();
                        answer += 2; 
                    } else {
                        stack.push(picked);
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}
