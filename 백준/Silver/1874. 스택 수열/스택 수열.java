import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = array[i];
            for (int j = max+1; j <= num; j++) {
                push(stack, sb, j);
            }
            int peek = stack.peek();

            if(max < num)
                max = num;

            if(num == peek) {
                pop(stack, sb);
            }
        }

        if(stack.isEmpty()){
            System.out.println(sb);
        }
        else {
            System.out.println("NO");
        }
    }

    private static void push(Stack<Integer> stack, StringBuilder sb, int n) {
        stack.push(n);
        sb.append('+').append('\n');
    }

    private static void pop(Stack<Integer> stack, StringBuilder sb) {
        stack.pop();
        sb.append('-').append('\n');
    }
}