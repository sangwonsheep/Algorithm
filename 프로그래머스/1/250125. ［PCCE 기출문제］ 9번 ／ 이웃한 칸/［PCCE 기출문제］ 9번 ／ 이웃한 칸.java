import java.util.*;

class Solution {
    
    static int[] dw = {1, 0, 0, -1};
    static int[] dh = {0, 1, -1, 0};
    
    static int n;
    
    public int solution(String[][] board, int h, int w) {
        n = board.length;        
        return bfs(board, h, w);
    }
    
    public int bfs(String[][] board, int h, int w) { 
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(w, h));
        
        int count = 0;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            w = node.getW();
            h = node.getH();
            
            for(int i = 0; i < 4; i++) {
                int w_check = w + dw[i];
                int h_check = h + dh[i];
                
                if(w_check >= n || w_check < 0 || h_check >= n || h_check < 0) {
                    continue;
                }
                
                if(board[h][w].equals(board[h_check][w_check])){
                    count++;
                }                    
            }
        }
        return count;
    }
    
    class Node {
        private int w;
        private int h;
        
        Node(int w, int h) {
            this.w = w;
            this.h = h;
        }
        
        public int getW() {
            return this.w;
        }
        
        public int getH() {
            return this.h;
        }
    }
}