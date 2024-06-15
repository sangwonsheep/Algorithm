import java.util.Scanner;

public class Main {

    public static boolean[][] check;
    public static int min = 64;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = input.next();

            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') {
                    check[i][j] = true;		// W일 때는 true
                } else {
                    check[i][j] = false;	// B일 때는 false
                }
            }
        }

        int n_row = n - 7;
        int m_col = m - 7;

        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < m_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    private static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = check[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if(check[i][j] != TF)
                    count++;

                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(count, min);
    }
}
