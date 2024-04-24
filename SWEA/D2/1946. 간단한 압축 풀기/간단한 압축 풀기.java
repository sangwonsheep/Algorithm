import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();

            StringBuilder sb = new StringBuilder();
            System.out.println("#" + tc);
            for(int i = 0; i < n; i++) {
                char c = input.next().charAt(0);
                int num = input.nextInt();

                for (int j = 0; j < num; j++) {
                    sb.append(c);
                    if(sb.length() == 10) {
                        System.out.println(sb.toString());
                        sb = new StringBuilder();
                    }
                }
            }

            if(sb.length() > 0)
                System.out.println(sb.toString());
        }
    }
}
