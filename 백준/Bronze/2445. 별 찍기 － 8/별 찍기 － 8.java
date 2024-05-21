import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n *= 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!(j <= i && i+j >= (n-1)) && (j <= i || i+j >= (n-1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}