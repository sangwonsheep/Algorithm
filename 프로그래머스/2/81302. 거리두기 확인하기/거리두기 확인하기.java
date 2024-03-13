class Solution {
    
    
    
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
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    for (int y = 0; y < 5; ++y) {
        for (int x = 0; x < 5; ++x) {
            if (place[y][x] == 'P') {
                for (int i = 0; i < 4; ++i) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5 || place[ny][nx] == 'X')
                        continue;
                    if (place[ny][nx] == 'B' || place[ny][nx] == 'P')
                        return false;
                    // char 배열을 직접 변경합니다.
                    place[ny][nx] = 'B';
                }
            }
        }
    }
    return true;
}
}