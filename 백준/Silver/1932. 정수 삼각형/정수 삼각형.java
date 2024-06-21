import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[][] mem = new int[501][501];

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        for (int[] a : mem) {
            Arrays.fill(a, -1);
        }

        int n = input.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = input.nextInt();
            }
        }

        System.out.println(triangle(0, 0, array));
    }

    private static int triangle(int x, int y, int[][] array) {
        if(y == array.length)
            return 0;

        if(mem[y][x] != -1)
            return mem[y][x];

        return mem[y][x] = array[y][x] + Math.max(triangle(x, y+1, array), triangle(x+1, y+1, array));
    }

}