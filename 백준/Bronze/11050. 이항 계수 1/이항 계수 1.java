import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        System.out.println(factorial(n) / (factorial(k) * factorial(n-k)));
    }

    public static int factorial(int n) {
        if(n == 0)
            return 1;

        return n * factorial(n-1);
    }
}