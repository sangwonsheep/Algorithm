import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];

        int sum = 0;
        int[] count = new int[8001];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            sum += array[i];
            count[array[i]+4000]++;
        }
        Arrays.sort(array);

        int max = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (max == count[i])
                list.add(i - 4000);
        }

        Collections.sort(list);

        System.out.println((int) (Math.round((double) sum / n)));
        System.out.println(array[array.length / 2]);
        System.out.println(list.size() > 1 ? list.get(1) : list.get(0));
        System.out.println(array[n-1] - array[0]);
    }

}