import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int[] count = new int[101];

            for (int i = 0; i < 1000; i++) {
                int score = input.nextInt();
                count[score]++;
            }

            int max = 0;
            int maxIndex = -1;
            for (int i = 0; i < count.length; i++) {
                if (max < count[i]){
                    max = count[i];
                    maxIndex = i;
                }
            }
            
            for (int i = 0; i < count.length; i++) {
                if (max == count[i]){
                    if(maxIndex < i)
                        maxIndex = i;
                }
            }

            System.out.println("#" + tc + " " + maxIndex);
        }
    }
}
