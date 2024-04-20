import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = input.nextInt();
            int[][] array = new int[n][n];
            for(int j = 0; j < n; j++)
                Arrays.fill(array[j], 1);

            for(int x = 2; x < n; x++) {
                for(int y = 1; y < x; y++) {
                    array[x][y] = array[x-1][y-1] + array[x-1][y];
                }
            }

            System.out.println("#" + i);
            for(int x = 0; x < n; x++) {
                for(int y = 0; y <= x; y++) {
                    System.out.print(array[x][y] + " ");
                }
                System.out.println();
            }
        }
    }
}
