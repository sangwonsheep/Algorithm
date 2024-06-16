import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int n = input.nextInt();

        input.nextLine();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String s = input.nextLine();
            if(s.contains("push")){
                String[] split = s.split(" ");
                stack.push(Integer.parseInt(split[1]));
                continue;
            }

            if(s.equals("top")) {
                if(stack.isEmpty()){
                    sb.append("-1");
                }
                else {
                    sb.append(stack.peek());
                }
            }
            else if(s.equals("pop")){
                if(stack.isEmpty()){
                    sb.append("-1");
                }
                else {
                    sb.append(stack.pop());
                }
            }
            else if(s.equals("size")){
                sb.append(stack.size());
            }
            else if(s.equals("empty")) {
                if(stack.isEmpty()) {
                    sb.append("1");
                }
                else {
                    sb.append("0");
                }
            }
            System.out.println(sb);
        }
    }
}