import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int speed = 0;
            int sum = 0;
            for(int i = 0; i < n; i++) {
                int command = input.nextInt();
                if(command != 0) {
                    int ms = input.nextInt();
                    if(command == 1) {
                        speed += ms;
                    }
                    else if(command == 2) {
                        speed -= ms;
                    }
                }

                if(speed < 0)
                    speed = 0;

                sum += speed;
            }

            System.out.println("#" + tc + " " + sum);
        }
    }
}
