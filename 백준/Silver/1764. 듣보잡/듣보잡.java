import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        Set<String> look = new HashSet<>();
        ArrayList<String> listen = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = input.next();
            look.add(name);
        }

        for (int i = 0; i < m; i++) {
            String name = input.next();
            if(look.contains(name))
                listen.add(name);
        }

        System.out.println(listen.size());
        listen.stream()
                .sorted()
                .forEach(System.out::println);

    }
}