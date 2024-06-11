class Solution {
    public int[] solution(int brown, int yellow) {
        for(int width = 3; width <= 5000; width++) {
            for(int height = 3; height <= width; height++) {
                int countBrown = (width + height - 2) * 2;
                int countYellow = width * height - countBrown;
                
                if(brown == countBrown && yellow == countYellow) {
                    return new int[]{width, height};
                }
            }
        }
        return null;
    }
}