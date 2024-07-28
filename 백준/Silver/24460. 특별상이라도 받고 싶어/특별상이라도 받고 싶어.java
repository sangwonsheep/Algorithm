import java.util.*;

public class Main {

    static int[][] chairs;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        chairs = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chairs[i][j] = input.nextInt();
            }
        }
        System.out.println(recur(0, 0, n));

    }

    public static int recur(int x, int y, int n) {
        if(n == 1) {
            return chairs[y][x];
        }

        int half = n/2;
        int topLeft = recur(x, y, half);
        int topRight = recur(x + half, y, half);
        int bottomLeft = recur(x, y + half, half);
        int bottomRight = recur(x + half, y + half, half);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(topLeft);
        list.add(topRight);
        list.add(bottomLeft);
        list.add(bottomRight);
        Collections.sort(list);
        return list.get(1);
    }

}
