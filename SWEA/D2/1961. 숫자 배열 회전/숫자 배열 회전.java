import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int[][] array = new int[n][n];
            String[] s = new String[n];
            Arrays.fill(s, "");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = input.nextInt();
                }
            }

            // 90도
            for (int i = 0; i < n; i++){
                for (int j = n-1; j >= 0; j--) {
                    s[i] += array[j][i];
                }
                s[i] += " ";
            }

            // 180도
            for (int i = n-1; i >= 0; i--) {
                for (int j = n-1; j >= 0; j--) {
                    s[(n-1)-i] += array[i][j];
                }
                s[(n-1)-i] += " ";
            }

            // 270도
            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    s[(n-1)-i] += array[j][i];
                }
            }

            System.out.println("#" + tc);
            for (String str : s) {
                System.out.println(str);
            }
        }
    }
}
