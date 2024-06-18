import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            if(s.equals("FizzBuzz") || s.equals("Fizz") || s.equals("Buzz")) {
            }
            else {
                num = Integer.parseInt(s);
                index = i;
            }
        }

        num += (3-index);

        if(num % 3 == 0) {
            if(num % 5 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if(num % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(num);
        }

    }

}