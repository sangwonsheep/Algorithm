import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reverse = Integer.parseInt(s2 + s1);
                    return reverse - original;
                })
                .collect(StringBuilder::new,
                         StringBuilder::append,
                         StringBuilder::append)
                .toString()
                .replaceAll("^0+", "0");
    }
}