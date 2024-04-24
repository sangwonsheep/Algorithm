import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int m = input.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = input.nextInt();
            }

            int sum = 0;
            int max = 0;
            if(n < m) {
                for (int i = 0; i <= m-n; i++) {
                    for (int j = 0; j < n; j++) {
                        sum += a[j] * b[i+j];
                    }
                    if(max < sum)
                        max = sum;
                    sum = 0;
                }
            }
            else {
                for (int i = 0; i <= n-m; i++) {
                    for (int j = 0; j < m; j++) {
                        sum += a[i+j] * b[j];
                    }
                    if(max < sum)
                        max = sum;
                    sum = 0;
                }
            }

            System.out.println("#" + tc + " " + max);
        }
    }
}
