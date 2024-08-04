import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        Map<String, Integer> map = new HashMap<>();
        int[] index = new int[friends.length]; // 선물 지수
        int[][] record = new int[friends.length][friends.length];
        
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            String sender = split[0];
            String receiver = split[1];
            
            index[map.get(sender)]++; // 준 사람 +1
            index[map.get(receiver)]--; // 받은 사람 -1
            record[map.get(sender)][map.get(receiver)]++; // 준 사람, 받은 사람
        }

       int answer = 0;
       for (int i = 0; i < friends.length; i++) {
           int count = 0;
           for (int j = 0; j < friends.length; j++) {
               if(i == j) continue; // 준 사람과 받은 사람이 같은 경우
               if (record[i][j] > record[j][i]) count++; // 두 사람 중 더 많은 선물을 준 사람이 받음
               else if (record[i][j] == record[j][i] && index[i] > index[j]) count++; 
           }
           answer = Math.max(count, answer);
       }
        return answer;
    }
}