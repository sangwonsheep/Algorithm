import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            array[i] = input.nextInt();
        }
        int t = input.nextInt();
        int p = input.nextInt();

        int t_count = 0;

        for (int i = 0; i < 6; i++) {
            if(array[i] % t != 0)
                t_count += array[i] / t + 1;
            else
                t_count += array[i] / t;
        }

        System.out.println(t_count);
        System.out.println(n/p + " " + n%p);
    }

}