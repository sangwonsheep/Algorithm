import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int result = 1;
            String s = input.next();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(s.length()-1-j)){
                    result = 0;
                    break;
                }
            }

            System.out.println("#" + i + " " + result);
        }
    }
}
