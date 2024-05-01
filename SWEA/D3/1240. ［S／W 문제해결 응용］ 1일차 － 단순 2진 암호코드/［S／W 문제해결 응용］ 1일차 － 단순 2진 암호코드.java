import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        String[] code = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};

        for (int tc = 1; tc <= t; tc++) {
            int n = input.nextInt();
            int m = input.nextInt();

            int[][] array = new int[n][m];
            String[] sArray = new String[n];

            for (int i = 0; i < n; i++) {
                sArray[i] = input.next();
            }

            for (int i = 0; i < n; i++) {
                String s = sArray[i];
                if(!s.contains("1")){
                    continue;
                }
                int index = s.lastIndexOf('1');
                String sub = s.substring(index-55 , index+1);

                String num = "";
                for (int j = 0; j < sub.length(); j += 7) {
                    for (int k = 0; k <= 9; k++) {
                        if((sub.substring(j, j+7)).equals(code[k])){
                            num += k;
                        }
                    }
                }

                int sum = 0;
                int result = 0;
                for (int j = 0; j < num.length(); j++) {
                    if(j % 2 == 0) {
                        sum += Character.getNumericValue(num.charAt(j)) * 3;
                    }
                    else {
                        sum += Character.getNumericValue(num.charAt(j));
                    }
                    result += Character.getNumericValue(num.charAt(j));
                }

                if(sum % 10 == 0) {
                    System.out.println("#" + tc + " " + result);
                }
                else {
                    System.out.println("#" + tc + " 0");
                }

                if(sum > 0)
                    break;
            }
        }
    }

}