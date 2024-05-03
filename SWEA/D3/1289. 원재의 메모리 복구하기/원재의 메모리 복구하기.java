import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            String s = input.next();
            char prev = '0';
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != prev){
                    count++;
                    prev = s.charAt(i);
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}