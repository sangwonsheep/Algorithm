import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            String s = input.next();
            char[] array = s.toCharArray();

            String cur = "";
            String next = "";
            int count = 0;

            for(int j = 0; j < s.length(); j++) {
                cur = s.substring(0, j+1);
                next = s.substring(j+1, j+1+cur.length());
                if(cur.equals(next)){
                    count = cur.length();
                    break;
                }
                cur = "";
                next = "";
            }

            System.out.println("#" + i + " " + count);
        }
	}
}