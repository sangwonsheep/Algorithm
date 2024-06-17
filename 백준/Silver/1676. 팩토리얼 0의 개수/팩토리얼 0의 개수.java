import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        BigInteger bi = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            bi = bi.multiply(new BigInteger("" + i));
        }

        String s = String.valueOf(bi);

        int count = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != '0')
                break;
            count++;
        }
        System.out.println(count);
    }

}