// package dp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int [][] array = new int[1001][3];
		int [][] dp = new int[1001][3];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				array[i][j] = input.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				dp[i][j] = array[i][j];
			}
		}

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 0) {
					dp[i][j] = array[i][j] + Math.min(dp[i-1][1], dp[i-1][2]);
				}
				else if(j == 1) {
					dp[i][j] = array[i][j] + Math.min(dp[i-1][0], dp[i-1][2]);
				}
				else if(j == 2) {
					dp[i][j] = array[i][j] + Math.min(dp[i-1][0], dp[i-1][1]);
				}
			}
		}
		
		System.out.println(Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2])));
	}

}
