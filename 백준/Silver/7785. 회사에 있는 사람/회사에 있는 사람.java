import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = input.next();
            String check = input.next();
            if(check.equals("enter"))
                set.add(name);
            else
                set.remove(name);
        }

        set.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
