
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] array = new int[n];
            long result = 0;

            for(int j = 0; j < n; j++) {
                array[j] = input.nextInt();
            }

            int max = 0;
            for(int j = n-1; j >= 0; j--) {
                if(max < array[j]) {
                    max = array[j];
                }
                result += max - array[j];
            }

            System.out.println("#" + (i+1) + " " + result);
		}
	}
}