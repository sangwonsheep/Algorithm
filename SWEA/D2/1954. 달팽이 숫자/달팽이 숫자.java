import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        // 우, 하, 좌, 상
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int[][] array = new int[n][n];

            int x = 0;
            int y = 0;
            int d = 0;
            int count = 1;
            while (true) {
                array[y][x] = count++;

                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx == n || ny == n || nx < 0 || ny < 0 || array[ny][nx] != 0) {
                    d = (d+1) % 4;
                    nx = x + dx[d];
                    ny = y + dy[d];

                    if(nx == n || ny == n || nx < 0 || ny < 0 || array[ny][nx] != 0)
                        break;
                }
                x = nx;
                y = ny;
            }

            System.out.println("#" + tc);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
