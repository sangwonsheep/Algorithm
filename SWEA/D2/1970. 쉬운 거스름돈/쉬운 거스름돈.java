import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = input.nextInt();

            int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
            int[] result = new int[8];

            for(int j = 0; j < 8; j++) {
                result[j] = n / moneys[j];
                n %= moneys[j];
            }

            System.out.println("#" + i);
            for (int j = 0; j < 8; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();

        }
    }
}
