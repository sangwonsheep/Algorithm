import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            String s = Integer.toString(i);

            s = s.replaceAll("[369]", "-");

            if(s.contains("-")){
                s = s.replaceAll("[0-9]", "");
            }

            System.out.print(s + " ");
        }
	}

}