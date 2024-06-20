import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[][][] mem = new int[21][21][21];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int[][] ints : mem) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, -1);
            }
        }

        while(true) {
            String s = br.readLine();
            String[] split = s.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);

            if(a == -1 && b == -1 && c == -1)
                break;

            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
        }
    }

    private static int w(int a, int b, int c) {
        if(isRange(a, b, c) && mem[a][b][c] != -1){
            return mem[a][b][c];
        }

        if(a <= 0 || b <= 0 || c <= 0)
            return 1;
        if(a > 20 || b > 20 || c > 20)
            return mem[20][20][20] = w(20, 20, 20);

        if(a < b && b < c)
            return mem[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);

        return mem[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }

    private static boolean isRange(int a, int b, int c) {
        return a >= 0 && a <= 20 && b >= 0 && b <= 20 && c >= 0 && c <= 20;
    }

}