import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    static int fib_count = 0;
    static int fibonacci_count = 0;

    static int[] mem = new int[41];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);

        System.out.println(fib_count + " " + fibonacci_count);
    }

    private static int fib(int n) {
        if(n == 1 || n == 2){
            fib_count++;
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    private static int fibonacci(int n) {
        mem[1] = mem[2] = 1;
        for (int i = 3; i <= n; i++) {
            mem[i] = mem[i-1] + mem[i-2];
            fibonacci_count++;
        }
        return mem[n];
    }

}