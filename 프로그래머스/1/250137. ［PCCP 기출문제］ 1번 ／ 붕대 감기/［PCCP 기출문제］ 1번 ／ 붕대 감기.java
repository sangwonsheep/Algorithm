class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {    
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량
        
        int nowHealth = health - attacks[0][1];
        if(nowHealth <= 0)
            return -1;
        
        for(int i = 1; i < attacks.length; i++) {
            int prevTime = attacks[i-1][0];
            int attackTime = attacks[i][0];
            int damage = attacks[i][1];

            int recoveryTime = attackTime - prevTime - 1;
            
            nowHealth += recoveryTime * x + (int)(recoveryTime / t) * y;
            
            if(nowHealth > health)
                nowHealth = health;
            
            nowHealth -= damage;
            
            if(nowHealth <= 0)
                return -1;
        }
  
        return nowHealth;
    }
}