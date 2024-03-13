class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        
        // 최대공약수 구하면서 자신의 나누어 떨어지는 수 구할 수 있음.
        for(int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(arrayA[i], gcdA);
            gcdB = gcd(arrayB[i], gcdB);
        }
        
        if(check(arrayB, gcdA)){
            answer = Math.max(gcdA, answer);
        }
        
        if(check(arrayA, gcdB)){
            answer = Math.max(gcdB, answer);
        }
        
        return answer;
    }
    
    // 내 최대공약수로 상대방 수가 떨어지는지 확인
    public boolean check(int[] array, int gcd) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % gcd == 0){
                return false;
            }
        }
        return true;
    }
    
    public int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
    }
}