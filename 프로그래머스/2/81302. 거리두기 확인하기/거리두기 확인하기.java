class Solution {
    
    // 상, 하, 좌, 우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int i = 0; i < 5; i++) {
            char[][] room = new char[5][5];
            for(int j = 0; j < 5; j++) {
                room[j] = places[i][j].toCharArray();
            }
            answer[i] = check(room) ? 1 : 0;
        }
        
        return answer;
    }
    
    public boolean check(char[][] room) {
        for(int y = 0; y < 5; y++) {
            for(int x = 0; x < 5; x++) {
                if(room[y][x] == 'P'){
                    for(int i = 0; i < 4; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];

                        if(nx >= 5 || ny >= 5 || nx < 0 || ny < 0 || room[ny][nx] == 'X')
                            continue;
                        
                        if(room[ny][nx] == 'P' || room[ny][nx] == 'V')
                            return false;
                        
                        room[ny][nx] = 'V';
                    }
                }
            }
        }
        return true;
    }
}