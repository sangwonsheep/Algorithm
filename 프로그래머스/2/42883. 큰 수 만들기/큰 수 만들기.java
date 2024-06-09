class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        char[] array = number.toCharArray();
        
        int length = array.length - k;
        int index = 0;
        
        for(int i = 0; i < length; i++) { // 문자 길이
            char max = '0';
            for(int j = index; j <= i+k; j++) { // 큰 값 구하기
                if(max < array[j]){
                    max = array[j];
                    index = j+1;
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}