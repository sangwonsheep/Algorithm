import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            String s = input.next();
            int[] check = new int[10];

            int count = 1;
            String n = s;
            while(true) {
                int sum = 0;
                for (int i = 0; i < n.length(); i++) {
                    check[n.charAt(i) - '0'] = 1;
                }

                for (int i = 0; i < check.length; i++) {
                    sum += check[i];
                }

                if(sum >= 10) {
                    break;
                }

                count++;
                n = Integer.toString(Integer.parseInt(s) * count);
            }
            System.out.println("#" + tc + " " + n);
        }
    }
}
