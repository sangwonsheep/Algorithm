import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();

        for (int tc = 1; tc <= 10; tc++) {
            int n = input.nextInt();
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < 8; i++) {
                queue.add(input.nextInt());
            }

            boolean check = false;
            while(true) {
                for (int i = 1; i <= 5; i++) {
                    int num = queue.poll() - i;
                    if(num <= 0) {
                        check = true;
                        queue.add(0);
                        break;
                    }
                    queue.add(num);
                }
                if(check)
                    break;
            }

            System.out.print("#" + n + " ");
            for (Integer integer : queue) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

}