import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int p = input.nextInt(); // a사 1L당 요금
            int q = input.nextInt(); // b사 기본 요금
            int r = input.nextInt(); // b사 월간 사용량
            int s = input.nextInt(); // b사 1L당 요금
            int w = input.nextInt(); // 사용한 수도량

            int a_fee = p * w;
            int b_fee = q;
            if(r < w) {
                b_fee += (w - r) * s;
            }

            System.out.println("#" + tc + " " + Math.min(a_fee, b_fee));
        }
    }
}
