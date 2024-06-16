import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(input.next());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if(set.contains(input.next()))
                count++;
        }
        System.out.println(count);
    }
}
