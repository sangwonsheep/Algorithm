import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        
        for(int i = 0; i < numbers.length(); i++) {
            visited = new boolean[numbers.length()];
            setNumbers(i, ""+numbers.charAt(i), numbers);    
        }
        
        return countPrime();
    }
    
    private void setNumbers(int index, String number, String numbers) {
        set.add(Integer.parseInt(number));
        visited[index] = true;
            
        if(number.length() == numbers.length()) {
            visited[index] = false;
            return;
        }
        
        for(int i = 0; i < numbers.length(); i++) {
            if(!visited[i])
                setNumbers(i, number + numbers.charAt(i), numbers);    
        }
        visited[index] = false;
    }
    
    private int countPrime() {
        int count = 0;
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            int n = (int) iter.next();
            if(is_prime(n)){
                count++;
            }
                
        }
        return count;
    }
    
    private boolean is_prime(int n) {
		if(n <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}