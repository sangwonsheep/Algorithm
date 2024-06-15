import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextInt();
            }
        }

        Arrays.sort(points, (i1, i2) -> {
            if(i1[1] == i2[1])
                return i1[0]-i2[0];
            return i1[1]-i2[1];
        });

        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}