import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = input.next();
        }

        Arrays.sort(words, (s1, s2) -> {
            if(s1.length() == s2.length())
                return s1.compareTo(s2);
            return s1.length() - s2.length();
        });

        String prev = "";
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            if(prev.equals(current))
                continue;
            System.out.println(current);
            prev = current;
        }
    }
}