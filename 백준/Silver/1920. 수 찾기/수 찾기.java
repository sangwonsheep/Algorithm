import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            if(Arrays.binarySearch(array, input.nextInt()) >= 0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}