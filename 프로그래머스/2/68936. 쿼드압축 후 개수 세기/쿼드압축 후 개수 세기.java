class Solution {
    public int[] solution(int[][] arr) {
        Count c = count(arr, 0, 0, arr.length);
        return new int[]{c.zero, c.one};
    }
    
    public Count count(int[][] arr, int x, int y, int size) {
        int h = size/2;
        for(int i = x; i < x+size; i++) {
            for(int j = y; j < y+size; j++) {
                if(arr[y][x] != arr[j][i]){
                    return count(arr, x, y, h)
                        .add(count(arr, x+h, y, h))
                        .add(count(arr, x, y+h, h))
                        .add(count(arr, x+h, y+h, h));
                }
            }
        }
        
        if(arr[y][x] == 1) {
            return new Count(0, 1);
        }
        return new Count(1, 0);
    }
    
    private static class Count {
        public final int zero;
        public final int one;
        
        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
        
        public Count add(Count other) {
            return new Count(this.zero + other.zero, this.one + other.one);
        }
    }
}