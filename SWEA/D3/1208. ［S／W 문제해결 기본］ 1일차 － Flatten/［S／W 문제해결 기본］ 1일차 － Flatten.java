import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int t = input.nextInt();

        for (int tc = 1; tc <= 10; tc++) {
            int dump = input.nextInt();
            int[] array = new int[100];

            for(int i = 0; i < 100; i++) {
                array[i] = input.nextInt();
            }

            Arrays.sort(array);

            for (int i = 0; i < dump; i++) {
                array[99]--;
                array[0]++;
                Arrays.sort(array);
            }

            System.out.println("#" + tc + " " + (array[99]-array[0]));
        }
    }

}
