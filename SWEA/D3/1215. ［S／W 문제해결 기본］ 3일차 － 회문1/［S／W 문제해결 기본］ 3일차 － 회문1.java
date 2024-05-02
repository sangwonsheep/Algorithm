import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();

        for (int tc = 1; tc <= 10; tc++) {
            int n = input.nextInt();
            char[][] table = new char[8][8];

            for (int i = 0; i < 8; i++) {
                table[i] = input.next().toCharArray();
            }

            int result = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8-n; j++) {
                    boolean rowCheck = true;
                    boolean colCheck = true;
                    for (int k = 0; k < (n/2); k++) {
                        if(table[i][j+k] != table[i][j+(n-1)-k]){
                            rowCheck = false;
                        }
                        if(table[j+k][i] != table[j+(n-1)-k][i]){
                            colCheck = false;
                        }

                    }
                    if(rowCheck)
                        result++;
                    if(colCheck)
                        result++;
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }

}