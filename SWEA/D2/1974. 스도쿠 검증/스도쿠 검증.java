import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int[][] array = new int[9][9];

            for(int x = 0; x < 9; x++) {
                for(int y = 0; y < 9; y++) {
                    array[x][y] = input.nextInt();
                }
            }

            Set<Integer> set = new HashSet<>();
            boolean check = true;
            for(int x = 0; x < 9; x++) {
                for(int y = 0; y < 9; y++) {
                    set.add(array[x][y]);
                }
                if(set.size() != 9)
                    check = false;
                set = new HashSet<>();
            }

            for(int x = 0; x < 9; x++) {
                for(int y = 0; y < 9; y++) {
                    set.add(array[y][x]);
                }
                if(set.size() != 9)
                    check = false;
                set = new HashSet<>();
            }

            for(int x = 0; x < 9; x += 3) {
                for(int y = 0; y < 9; y += 3) {
                    for(int a = 0; a < 3; a++) {
                        for(int b = 0; b < 3; b++) {
                            set.add(array[x+a][y+b]);
                        }
                    }
                    if(set.size() != 9)
                        check = false;
                    set = new HashSet<>();
                }
            }

            int result = check ? 1 : 0;

            System.out.println("#" + i + " " + result);
        }
    }
}
