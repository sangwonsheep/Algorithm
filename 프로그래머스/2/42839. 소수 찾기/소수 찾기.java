import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    static boolean[] check = new boolean[10000001];
    
    public int solution(String numbers) {
        setPrime(check.length-1);
        
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
            if(!check[n]){
                count++;
            }
                
        }
        return count;
    }
    
    private void setPrime(int n) {
		check[0] = check[1] = true;
		if(n < 2)
			return;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            for(int j = i*i; j <= n; j += i){
                check[j] = true;
            }
        }
    }
}