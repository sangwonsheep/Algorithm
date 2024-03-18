// package implement;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int k = input.nextInt();
		
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0; i < k; i++) {
			int n = input.nextInt();
			if(n != 0) {
				s.push(n);
			}
			else {
				s.pop();
			}
		}
		int sum = 0;
		
		for(int i : s)
			sum += i;
		System.out.println(sum);
	}

}
