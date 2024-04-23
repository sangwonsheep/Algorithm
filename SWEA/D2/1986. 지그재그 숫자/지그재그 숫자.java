import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = input.nextInt();
            int sum = 0;
            for(int j = 1; j <= n; j++) {
                if(j % 2 != 0)
                    sum += j;
                else
                    sum -= j;
            }

            System.out.println("#" + i + " " + sum);
        }
    }
}
