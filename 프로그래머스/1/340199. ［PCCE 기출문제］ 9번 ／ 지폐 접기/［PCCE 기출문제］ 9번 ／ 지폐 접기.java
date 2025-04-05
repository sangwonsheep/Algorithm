class Solution {
    
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;


        while (max(wallet) < max(bill) || min(wallet) < min(bill)) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            }
            else {
                bill[1] /= 2;
            }
            answer++;
        }
        
        return answer;
    }
    
    private int max(int[] array) {
        return Math.max(array[0], array[1]);
    }
    
    private int min(int[] array) {
        return Math.min(array[0], array[1]);
    }
}