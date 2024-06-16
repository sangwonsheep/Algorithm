import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(input.nextInt());
        }

        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int check = input.nextInt();
            if (set.contains(check)) {
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }
    }
}
