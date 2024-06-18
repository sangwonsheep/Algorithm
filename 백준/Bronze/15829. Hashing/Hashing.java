import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        BigInteger bigInteger = new BigInteger("" + (s.charAt(0) - 'a' + 1));
        for (int i = 1; i < s.length(); i++) {
            int c = (s.charAt(i) - 'a' + 1) * (int) Math.pow(31, i);
            bigInteger = bigInteger.add(new BigInteger("" + c));
        }
        System.out.println(bigInteger);
    }

}