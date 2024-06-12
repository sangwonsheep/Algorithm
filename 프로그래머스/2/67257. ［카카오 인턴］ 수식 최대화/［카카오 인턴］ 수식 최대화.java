import java.util.*;

class Solution {
    
    private static final String[][] OPERATOR = {
        "*+-".split(""),
        "*-+".split(""),
        "+*-".split(""),
        "+-*".split(""),
        "-*+".split(""),
        "-+*".split("")
    };
    
    public long solution(String expression) {
        long max = 0;
        
        for (String[] op : OPERATOR) {
            long value = Math.abs(calculate(splitExpression(expression), op));
            if(max < value)
                max = value;
        }
        return max;
    }
    
    private long calculate(List<String> list, String[] s) {
        for (String op : s) {
            for(int i = 0; i < list.size(); i++) {
                if(list.get(i).equals(op)){
                    long left = Long.parseLong(list.get(i-1));
                    long right = Long.parseLong(list.get(i+1));
                    long result = operator(left, right, op);
                    
                    list.remove(i-1);
                    list.remove(i-1);
                    list.remove(i-1);
                    list.add(i-1, String.valueOf(result));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(list.get(0));
    }
    
    public long operator(long left, long right, String op) {
        return switch(op) {
            case "*" -> left * right;
            case "+" -> left + right;
            case "-" -> left - right;
            default -> 0;
        };
    }
    
    public List<String> splitExpression(String expression) {
        StringTokenizer st = new StringTokenizer(expression, "+*-", true);
        List<String> list = new ArrayList<>();
        while(st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        
        return list;
    }
}