import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        String[] grades = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

        for (int i = 1; i <= t; i++) {
            int n = input.nextInt(); // 학생 수
            int k = input.nextInt(); // k번째 학생
            double k_score = 0.0; // k번째 학생 점수

            double[] scores = new double[n];

            for (int j = 0; j < n; j++) {
                int mid_term = input.nextInt();
                int final_term = input.nextInt();
                int assignment = input.nextInt();

                double score = mid_term * 0.35 + final_term * 0.45 + assignment * 0.2;
                scores[j] = score;
            }
            k_score = scores[k-1];
            Arrays.sort(scores);

            int index = Arrays.binarySearch(scores, k_score);
            int grade_index = index / (n / 10);

            if(grade_index == n)
                grade_index--;

            System.out.println("#" + i + " " + grades[grade_index]);
        }
    }
}
