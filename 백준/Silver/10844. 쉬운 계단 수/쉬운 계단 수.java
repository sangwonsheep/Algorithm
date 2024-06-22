import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long[][] mem = new long[101][10];
    final static long MOD = 1000000000;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        for (long[] a : mem) {
            Arrays.fill(a, -1);
        }

        int n = input.nextInt();

        long result = 0;
        for (int i = 1; i <= 9; i++) {
            result += recur(n, i);
        }

        System.out.println(result % MOD);
    }

    private static long recur(int digit, int value) {
        if(digit == 1)
            return 1;

        if(mem[digit][value] != -1)
            return mem[digit][value];

        if(value == 0)
            return mem[digit][value] = recur(digit-1, 1);
        if(value == 9)
            return mem[digit][value] = recur(digit-1, 8);

        return mem[digit][value] = (recur(digit-1, value-1) + recur(digit-1, value+1)) % MOD;
    }

}