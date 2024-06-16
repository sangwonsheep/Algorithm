import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String[][] s = new String[n][3];

        input.nextLine();
        for (int i = 0; i < n; i++) {
            String[] tmp = input.nextLine().split(" ");
            s[i][0] = tmp[0];
            s[i][1] = tmp[1];
            s[i][2] = String.valueOf(i);
        }

        Arrays.sort(s, (s1, s2) ->{
            int compare = Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            if(compare == 0)
                return Integer.parseInt(s1[2])-Integer.parseInt(s2[2]);
            return compare;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i][0] + " " + s[i][1]);
        }
    }


}
