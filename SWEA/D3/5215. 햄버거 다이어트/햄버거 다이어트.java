import java.util.*;

public class Solution {

    static int n, limit;
    static int[] score;
    static int[] cal;
    static int result;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            n = input.nextInt();
            limit = input.nextInt();
            score = new int[n];
            cal = new int[n];

            for (int i = 0; i < n; i++) {
                score[i] = input.nextInt();
                cal[i] = input.nextInt();
            }

            result = 0;
            hamburger(0, 0, 0);
            System.out.println("#" + tc + " " + result);
        }
    }

    public static void hamburger(int i, int sumScore, int sumCal) {
        if(sumCal > limit)
            return;
        if(i == n){
            result = Math.max(sumScore, result);
            return;
        }

        hamburger(i+1, sumScore + score[i], sumCal + cal[i]);
        hamburger(i+1, sumScore, sumCal);
    }
}