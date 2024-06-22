import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] mem = new int[10001];

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Arrays.fill(mem, -1);

        int n = input.nextInt();
        int[] array = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            array[i] = input.nextInt();
        }

        mem[0] = 0;
        mem[1] = array[1];

        if(n > 1)
            mem[2] = array[1] + array[2];

        System.out.println(recur(n, array));
    }

    private static int recur(int n, int[] array) {
        if(n < 0) {
            return 0;
        }

        if(mem[n] != -1) {
            return mem[n];
        }

        return mem[n] = Math.max(Math.max(recur(n-2, array), recur(n-3, array) + array[n-1]) + array[n], recur(n-1, array));
    }

}