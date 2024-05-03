import java.util.*;

public class Solution {

    static int[] queen;
    static int count;
    static int n;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            n = input.nextInt();
            queen = new int[n];
            count = 0;
            nQueen(0);
            System.out.println("#" + tc + " " + count);
        }
    }

    public static void nQueen(int col) {
        if(col == n){
            count++;
            return;
        }

        for (int row = 0; row < n; row++) {
            queen[col] = row;

            if(possibility(col)){
                nQueen(col+1);
            }
        }

    }

    public static boolean possibility(int col) {
        for (int i = 0; i < col; i++) {
            // 같은 행인 경우 (가로)
            if(queen[i] == queen[col]){
                return false;
            }

            // 대각선인 경우
            else if(Math.abs(col - i) == Math.abs(queen[col] - queen[i])) {
                return false;
            }
        }
        return true;
    }

}