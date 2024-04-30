import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int t = input.nextInt();

        for (int tc = 1; tc <= 10; tc++) {
            int t = input.nextInt();
            int max = 0;
            int[][] array = new int[100][100];

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    array[i][j] = input.nextInt();
                }
            }

            int rowSum = 0;
            int colSum = 0;
            // 각 행, 열의 합
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    rowSum += array[i][j];
                    colSum += array[j][i];
                }
                max = Math.max(max, rowSum);
                max = Math.max(max, colSum);
                rowSum = 0;
                colSum = 0;
            }

            // 각 대각선의 합
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < 100; i++) {
                leftSum += array[i][i];
                rightSum += array[i][99-i];
            }
            max = Math.max(max, leftSum);
            max = Math.max(max, rightSum);

            System.out.println("#" + tc + " " + max);
        }
    }

}
