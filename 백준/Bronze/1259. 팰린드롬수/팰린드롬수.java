import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
            String s = input.next();
            if(s.equals("0"))
                break;

            boolean check = true;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != s.charAt(s.length()-1-i)){
                    check = false;
                    break;
                }
            }

            if(check)
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }

}