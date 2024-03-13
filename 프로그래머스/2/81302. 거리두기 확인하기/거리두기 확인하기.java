class Solution {
    
    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < places.length; i++) {
            char[][] place = new char[5][5];
            for (int j = 0; j < 5; j++) {
                place[j] = places[i][j].toCharArray();
            }
            answer[i] = isSafe(place) ? 1 : 0;
        }
        return answer;
    }
    
    public boolean isSafe(char[][] place) {
    
    for (int x = 0; x < 5; ++x) {
        for (int y = 0; y < 5; ++y) {
            if (place[x][y] == 'P') {
                for (int i = 0; i < 4; ++i) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5 || place[nx][ny] == 'X')
                        continue;
                    
                    if (place[nx][ny] == 'B' || place[nx][ny] == 'P')
                        return false;

                    place[nx][ny] = 'B';
                }
            }
        }
    }
    return true;
}
}