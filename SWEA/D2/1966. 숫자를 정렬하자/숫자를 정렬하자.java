import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int[] array = new int[n];

            for(int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }

            Arrays.sort(array);

            System.out.print("#" + tc + " ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
