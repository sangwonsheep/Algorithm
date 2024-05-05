import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();

        for (int tc = 1; tc <= 10; tc++) {
            int n = input.nextInt();
            int[][] array = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = input.nextInt();
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                boolean red = false;
                boolean blue = false;
                for (int j = 0; j < n; j++) {
                    if(array[j][i] == 1){
                        red = true;
                        blue = false;
                    }
                    else if(array[j][i] == 2) {
                        blue = true;
                    }

                    if(red == true && blue == true) {
                        count++;
                        red = false;
                        blue = false;
                    }
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}