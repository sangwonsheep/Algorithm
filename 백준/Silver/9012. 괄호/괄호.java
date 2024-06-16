import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int test_case = 0; test_case < t; test_case++) {
            Stack<Character> stack = new Stack<>();

            String s = input.next();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(stack.isEmpty()){
                    stack.push(c);
                    continue;
                }

                if(stack.peek() == '(' && c == ')'){
                    stack.pop();
                }
                else {
                    stack.push(c);
                }

            }
            if(stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }


    }
}