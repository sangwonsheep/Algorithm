import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        int[] month_day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int tc = 1; tc <= t; tc++) {
            int m1 = input.nextInt();
            int d1 = input.nextInt();
            int m2 = input.nextInt();
            int d2 = input.nextInt();

            int result = 1;
            if(m1 == m2) {
                result += d2-d1;
            }
            else {
                result += month_day[m1] - d1;
                result += d2;
                for(int i = m1+1; i <= m2-1; i++) {
                    result += month_day[i];
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
