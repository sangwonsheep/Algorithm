import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            array[i] = input.nextInt();
        }

        for (int x = -1000; x <= 1000; x++) {
            for (int y = -1000; y <= 1000; y++) {
                if(array[0]*x + array[1]*y == array[2] && array[3]*x + array[4]*y == array[5]){
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}
