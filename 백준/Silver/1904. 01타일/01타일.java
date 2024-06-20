import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[] mem = new int[1000001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Arrays.fill(mem, -1);
        for (int i = 0; i <= n; i++) {
            fibo(i);
        }
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n == 0 || n == 1 || n == 2)
            return n;

        if(mem[n] != -1)
            return mem[n];

        return mem[n] = (fibo(n-1) + fibo(n-2)) % 15746;
    }

}