import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            String s = input.next();

            String encode = "";
            String decode = "";
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // 알파벳
                if(Character.isAlphabetic(c)){
                    // 소문자
                    if(Character.isLowerCase(c)) {
                        encode += String.format("%06d", Integer.parseInt(Integer.toBinaryString((c - 'a' + 26))));
                    }
                    // 대문자
                    else {
                        encode += String.format("%06d", Integer.parseInt(Integer.toBinaryString((c - 'A'))));
                    }
                }
                else {
                    // + 또는 /
                    if(c == '+'){
                        encode += String.format("%06d", Integer.parseInt(Integer.toBinaryString(62)));
                    }
                    else if(c == '/'){
                        encode += String.format("%06d", Integer.parseInt(Integer.toBinaryString(63)));
                    }
                    // 숫자 0~9
                    else {
                        encode += String.format("%06d", Integer.parseInt(Integer.toBinaryString((c - '0' + 52))));
                    }
                }
            }

            String temp = "";
            for(int i = 0; i < encode.length(); i += 8) {
                if(i+8 >= encode.length()){
                    temp = encode.substring(i, encode.length());
                }
                else {
                    temp = encode.substring(i, i+8);
                }
                decode += (char) Integer.parseInt(temp, 2);
            }

            System.out.println("#" + tc + " " + decode);
        }
    }
}
