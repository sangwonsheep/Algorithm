import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            index = (index + k - 1) % list.size();
            result.add(list.get(index));
            list.remove(index);
        }

        StringBuilder sb = new StringBuilder(String.valueOf(result));
        sb.replace(0, 1, "<");
        sb.replace(sb.length() - 1, sb.length(), ">");
        System.out.println(sb);
    }

}