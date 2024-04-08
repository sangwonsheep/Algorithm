class Solution {
    boolean solution(String s) {
        char[] array = s.toLowerCase().toCharArray();
        int[] count = new int[2]; // [0] : p의 개수, [1] : y의 개수
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 'p')
                count[0]++;
            else if(array[i] == 'y')
                count[1]++;
        }

        if(count[0] == count[1])
            return true;
        else
            return false;
    }
}