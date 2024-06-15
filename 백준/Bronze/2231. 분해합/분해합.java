import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = num;

            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum == n){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}