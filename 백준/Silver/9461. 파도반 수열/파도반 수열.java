import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static long[] mem = new long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        Arrays.fill(mem, -1);

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(p(n));
        }

    }

    private static long p(int n) {
        if(mem[n] != -1) return mem[n];

        if(n == 0) return 0;
        if(n <= 3) return 1;
        if(n == 4 || n == 5) return 2;

        return mem[n] = p(n-1) + p(n-5);
    }

}