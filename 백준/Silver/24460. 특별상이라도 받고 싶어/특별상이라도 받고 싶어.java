import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] chairs;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        chairs = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                chairs[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        System.out.println(recur(0, 0, n));

    }

    public static int recur(int x, int y, int n) {
        if(n == 1) {
            return chairs[y][x];
        }

        int half = n/2;
        int topLeft = recur(x, y, half);
        int topRight = recur(x + half, y, half);
        int bottomLeft = recur(x, y + half, half);
        int bottomRight = recur(x + half, y + half, half);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(topLeft);
        list.add(topRight);
        list.add(bottomLeft);
        list.add(bottomRight);
        Collections.sort(list);
        return list.get(1);
    }


}
