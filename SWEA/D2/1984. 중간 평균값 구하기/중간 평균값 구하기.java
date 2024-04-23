import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int[] array = new int[10];
            int sum = 0;
            for(int j = 0; j < 10; j++) {
                array[j] = input.nextInt();
            }
            Arrays.sort(array);
            for(int j = 1; j < 9; j++) {
                sum += array[j];
            }

            System.out.println("#" + i + " " + Math.round((double)sum/8));
        }
    }
}
