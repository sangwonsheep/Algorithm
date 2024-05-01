import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int[][] array = new int[n][n];

            for (int i = 0; i < n; i++) {
                String s = input.next();
                for (int j = 0; j < s.length(); j++) {
                    array[i][j] = s.charAt(j) - '0';
                }
            }

            int index = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = (n/2)-index; j <= (n/2)+index; j++) {
                    sum += array[i][j];
                }
                if(i < (n/2)) {
                    index++;
                }
                else {
                    index--;
                }
            }
            System.out.println("#" + tc + " " + sum);
        }
    }

}