import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int m = 1234567891;
        long sum = 0;
        long pow = 1;
        for (int i = 0; i < n; i++) {
            sum += (s.charAt(i) - 'a' + 1) * pow;
            pow = (pow * 31) % m;
        }
        System.out.println(sum % m);
    }

}