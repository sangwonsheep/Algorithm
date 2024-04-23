import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int h1 = input.nextInt();
            int m1 = input.nextInt();
            int h2 = input.nextInt();
            int m2 = input.nextInt();

            int h_sum = h1 + h2;
            int m_sum = m1 + m2;
            if(m_sum >= 60) {
                h_sum += m_sum / 60;
                m_sum %= 60;
            }
            
            if(h_sum > 12)
                h_sum -= 12;

            System.out.println("#" + i + " " + h_sum + " " + m_sum);
        }
    }
}
