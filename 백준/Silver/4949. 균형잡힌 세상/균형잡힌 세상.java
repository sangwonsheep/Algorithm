import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true) {
            String s = input.nextLine();
            if(s.equals("."))
                break;

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '(' || c == '[') {
                    stack.push(c);
                }
                else if(c == ')' || c == ']') {
                    if(stack.isEmpty()) {
                        stack.push(c);
                    }
                    else {
                        char top = stack.peek();
                        if (top == '(' && c == ')') {
                            stack.pop();
                        } else if (top == '[' && c == ']') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                    }
                }
            }
            System.out.println(stack.isEmpty() ? "yes" : "no");
        }
    }

}