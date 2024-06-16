import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] coordinates = new int[n];

        for (int i = 0; i < n; i++) {
            coordinates[i] = input.nextInt();
        }

        Set<Integer> set = new TreeSet<>();
        for (int coordinate : coordinates) {
            set.add(coordinate);
        }

        List<Integer> list = new ArrayList<>(set);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(coordinates[i])).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
