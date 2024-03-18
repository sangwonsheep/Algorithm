import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int v = input.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(v == array[i])
                count++;
        }
        System.out.println(count);
    }
}

