import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        Map<Integer, String> number = new HashMap<>();
        Map<String, Integer> alpha = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = input.next();
            number.put((i+1), s);
            alpha.put(s, (i+1));
        }

        for (int i = 0; i < m; i++) {
            String s = input.next();
            if(Character.isAlphabetic(s.charAt(0))) {
                System.out.println(alpha.get(s));
            }
            else {
                System.out.println(number.get(Integer.parseInt(s)));
            }
        }

    }
}