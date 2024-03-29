class Solution {
    public int solution(int n) {
        int lcm = lcm(n, 6);
        return lcm / 6;
    }
    
    public int gcd(int a, int b) {
        if(b == 0)
            return a;
        
        return gcd(b, a % b);
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}