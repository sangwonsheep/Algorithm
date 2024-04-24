import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int[] array = {2, 3, 5, 7, 11};
            int[] count = new int[5];

            for(int i = 0; i < array.length; i++) {
                while(n % array[i] == 0) {
                    n /= array[i];
                    count[i]++;
                }
            }
            System.out.print("#" + tc + " ");
            for (int i : count) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
