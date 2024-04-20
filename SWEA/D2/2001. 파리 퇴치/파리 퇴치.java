import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();

            int[][] array = new int[n][n];

            for(int x = 0; x < n; x++) {
                for(int y = 0; y < n; y++) {
                    array[x][y] = input.nextInt();
                }
            }

            int max = 0;
            for(int x = 0; x < n-(m-1); x++) {
                for(int y = 0; y < n-(m-1); y++) {
                    int sum = 0;
                    for(int a = 0; a < m; a++) {
                        for(int b = 0; b < m; b++) {
                            sum += array[x+a][y+b];
                        }
                    }
                    if(max < sum)
                        max = sum;
                }
            }
            System.out.println("#" + i + " " + max);
        }
    }
}
