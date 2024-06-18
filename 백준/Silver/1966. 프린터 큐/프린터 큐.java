import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = input.nextInt();
            int m = input.nextInt();

            int[] array = new int[n];

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int priority = input.nextInt();
                array[i] = priority;
                queue.offer(i);
            }

            int count = 0;
            while(!queue.isEmpty()) {
                boolean check = false;
                int prev = queue.poll();

                for (int i : array) {
                    if(array[prev] < i) {
                        queue.offer(prev);
                        check = true;
                        break;
                    }
                }

                if(!check) {
                    count++;
                    array[prev] = 0;
                    if(prev == m) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }

    }

}