import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int n = input.nextInt();

        int[] cables = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            cables[i] = input.nextInt();
            if(max < cables[i])
                max = cables[i];
        }
        max++;

        long min = 0;
        long mid = 0;

        while(min < max) {
            mid = (min+max) / 2;
            long count = 0;

            for (int i = 0; i < cables.length; i++) {
                count += cables[i] / mid;
            }

            if(count < n) max = mid;
            else min = mid + 1;
        }

        System.out.println(min-1);
    }

}