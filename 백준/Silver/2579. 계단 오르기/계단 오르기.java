import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] mem = new int[301];

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        Arrays.fill(mem, -1);

        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println(stair(n-1, array));
    }
    private static int stair(int n, int[] array) {
        // n번째 계단이 0번째 계단일 때 처리
        if (n == 0) return array[0];
        // n번째 계단이 1번째 계단일 때 처리
        if (n == 1) return array[0] + array[1];
        // n번째 계단이 2번째 계단일 때 처리
        if (n == 2) return Math.max(array[0] + array[2], array[1] + array[2]);

        if (mem[n] != -1) return mem[n];

        // n번째 계단을 밟을 때, 연속된 세 계단을 밟지 않기 위해 두 가지 경우를 고려
        mem[n] = Math.max(stair(n-2, array), stair(n-3, array) + array[n-1]) + array[n];

        return mem[n];
    }

}