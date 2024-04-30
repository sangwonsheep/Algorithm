import java.util.*;

public class Solution {

    static int[] list;
    static int count = 0;
    static int max = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        for (int tc = 1; tc <= t; tc++) {
            String[] s = input.nextLine().split(" ");
            String num = s[0];
            count = Integer.parseInt(s[1]);

            if(count > num.length()) {
                count = num.length();
            }

            list = new int[num.length()];
            for (int i = 0; i < list.length; i++) {
                list[i] = num.charAt(i) - '0';
            }

            dfs(0, 0);
            System.out.println("#" + tc + " " + max);

            // 테스트케이스마다 전역 변수 초기화
            init();
        }
    }

    static void dfs(int cur, int cnt) {
        // 종료 조건
        if(cnt == count) {
            max = Math.max(max, Integer.parseInt(Arrays.toString(list).replaceAll("[^0-9]", "")));
            return;
        }

        // 반복 조건
        for (int i = cur; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {
                swap(i, j);
                dfs(i, cnt + 1);
                swap(i, j);
            }
        }
    }

    static void swap(int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    static void init() {
        list = null;
        count = 0;
        max = 0;
    }
}
