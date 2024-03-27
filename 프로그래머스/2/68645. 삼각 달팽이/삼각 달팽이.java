class Solution {
    
    // 아래, 오른쪽, 왼쪽 위 대각선
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};
    
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
       
        
        int x = 0;
        int y = 0;
        int d = 0; // 방향
        int count = 1; // 1부터 n까지 증가시키는 값
        
        while(true) {
            triangle[y][x] = count++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            // 방향 전환 조건
            if(nx == n || ny == n || nx < 0 || ny < 0 || triangle[ny][nx] != 0) {
                d = (d+1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                // 종료 조건
                if(nx == n || ny == n || nx < 0 || ny < 0 || triangle[ny][nx] != 0) 
                    break;
            }
            x = nx;
            y = ny;
        }
        
        int[] result = new int[count-1];
        int index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }
        
        return result;
    }
    
}