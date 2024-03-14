import java.util.*;

class Solution {
    static int dx[] = {-1, 1, 0 ,0};
    static int dy[] = {0, 0, -1, 1};
    static char[][] graph;
    static boolean[][] visited;
    static int n, m;

    public int solution(String[] board) {
        n = board.length;
        m = board[0].length();

        graph = new char[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < board.length; i++) {
            graph[i] = board[i].toCharArray();
        }
        // 시작 좌표 구하기
        int[] point = findStartPoint();
        int startX = point[0];
        int startY = point[1];

        return bfs(startX, startY);
    }

    public int bfs(int x, int y) {
        int answer = Integer.MAX_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y, 0));

        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            int count = node.getCount();

            // 목적지 도착
            if(graph[x][y] == 'G'){
                answer = Math.min(answer, count);
                continue;
            }

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m || graph[nx][ny] == 'D')
                    continue;

                // 미끄러지는 부분
                while(nx >= 0 && nx < n && ny >= 0 && ny < m && graph[nx][ny] != 'D') {
                    nx += dx[i];
                    ny += dy[i];
                }

                // 빼는 이유 : 장애물 좌표나 벗어난 범위의 좌표로 설정되어 있기 때문에
                nx -= dx[i];
                ny -= dy[i];

                if(!visited[nx][ny]) {
                    q.offer(new Node(nx, ny, count+1));
                    visited[nx][ny] = true;
                }
            }
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public int[] findStartPoint(){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(graph[i][j] == 'R')
                    return new int[]{i, j};
            }
        }
        return null;
    }

    class Node {
        private int x;
        private int y;
        private int count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public int getCount() {
            return this.count;
        }
    }
}