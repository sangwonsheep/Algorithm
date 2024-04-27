import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int t = input.nextInt();

        for (int tc = 1; tc <= 10; tc++) {
            int n = input.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }

            int result = 0;
            for (int i = 2; i < n-2; i++) {
                ArrayList<Integer> list = new ArrayList<>();
                // 왼쪽 체크
                for (int j = 2; j > 0; j--){
                    list.add(array[i-j]);
                }
                // 오른쪽 체크
                for (int j = 1; j <= 2; j++){
                    list.add(array[i+j]);
                }

                int max = 0;
                for (Integer num : list) {
                    if(max < num)
                        max = num;
                }

                if(max < array[i])
                    result += array[i] - max;
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
