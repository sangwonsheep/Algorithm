class Solution {
    
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        if (wallet[0] > wallet[1])
            swap(wallet);
        if (bill[0] > bill[1])
            swap(bill);

        while (wallet[0] < bill[0] || wallet[1] < bill[1]) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            }
            else {
                bill[1] /= 2;
            }
            
            if (bill[0] > bill[1])
                swap(bill);
            answer++;
        }
        
        return answer;
    }
    
    public void swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}