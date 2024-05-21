import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n *= 2;
        n -= 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!((j < n-i) && (j <= i)) && ((j < n-i) || (j <= i)) || i == j || i+j == n-1)
                    System.out.print("*");
                else if(((j < n-i) && (j <= i)) && ((j < n-i) || (j <= i)) || i == j || i+j == n-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}