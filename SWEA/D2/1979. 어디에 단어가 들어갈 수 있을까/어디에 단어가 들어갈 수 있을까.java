import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = input.nextInt(); // 가로, 세로 길이
            int k = input.nextInt(); // 단어 길이

            int[][] array = new int[n][n];
            int result = 0;

            for(int x = 0; x < n; x++) {
                for(int y = 0; y < n; y++) {
                    array[x][y] = input.nextInt();
                }
            }

            int count = 0;
            for(int x = 0; x < n; x++) {
                for(int y = 0; y < n; y++) {
                    if(array[x][y] == 1)
                        count++;
                    else {
                        if(count == k){
                            result++;
                        }
                        count = 0;
                    }
                }
                if(count == k)
                    result++;
                count = 0;
            }

            for(int x = 0; x < n; x++) {
                for(int y = 0; y < n; y++) {
                    if(array[y][x] == 1)
                        count++;
                    else {
                        if(count == k){
                            result++;
                        }
                        count = 0;
                    }
                }
                if(count == k)
                    result++;
                count = 0;
            }

            System.out.println("#" + i + " " + result);
        }
    }
}
