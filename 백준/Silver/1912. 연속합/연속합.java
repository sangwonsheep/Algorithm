import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] mem;
    static int max = -1001;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        mem = new int[n];
        Arrays.fill(mem, Integer.MIN_VALUE);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        mem[0] = array[0];
        max = array[0];

        recur(n - 1, array);
        System.out.println(max);
    }

    private static int recur(int n, int[] array) {
        if(mem[n] != Integer.MIN_VALUE)
            return mem[n];

        mem[n] = Math.max(recur(n-1, array) + array[n], array[n]);
        max = Math.max(mem[n], max);
        return mem[n];
    }

}