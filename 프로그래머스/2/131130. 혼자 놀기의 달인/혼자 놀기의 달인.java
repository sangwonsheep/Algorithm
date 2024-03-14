import java.util.*;

class Solution {
    public int solution(int[] cards) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < cards.length; i++) {
            int card = cards[i];
            int next = 0;
            if(card == 0)
                continue;

            int count = 0;
            cards[i] = 0;
            while(true) {
                if(card == 0)
                    break;
                count++;
                next = cards[card-1];
                cards[card-1] = 0;
                card = next;
            }

            if(count > 0)
                list.add(count);
        }

        if(list.size() <= 1)
            return 0;

        list.sort(Comparator.reverseOrder());
        return list.get(0) * list.get(1);
    }
    

}