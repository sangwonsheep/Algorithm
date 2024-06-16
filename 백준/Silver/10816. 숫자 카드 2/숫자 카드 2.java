import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int m = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = input.nextInt();
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }
        System.out.println(sb);
    }
}