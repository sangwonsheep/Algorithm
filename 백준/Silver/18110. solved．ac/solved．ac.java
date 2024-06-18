import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);
        int min = (int) Math.round(n * 0.15);

        int sum = 0;
        for (int i = min; i < n - min; i++) {
            sum += array[i];
        }
        System.out.println((int) Math.round((double) sum / (n - min * 2)));
    }

}