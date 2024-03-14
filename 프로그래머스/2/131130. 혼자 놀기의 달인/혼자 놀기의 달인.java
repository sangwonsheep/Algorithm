import java.util.*;

/*
<테스트 케이스 2번을 실패하시는 분들>
테스트 케이스 2번은 cards = [ 2, 3, 4, 5, 6, 7, 8, 9, 10 , 1 ] 와 같은 첫 시도에 10개의 모든 상자를 연 경우, 두 번째 시도는 모든 상자가 열려 있기 때문에 '0'이 되므로 '0'을 반환해야 합니다.
*/
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
            
            while(card != 0) {
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
    
    // 다른 풀이
    private int solveByLoof(int[] cards) {
        List<Integer> answer = new ArrayList<>();
        boolean[] visited = new boolean[cards.length];
        for(int card: cards) {
            int count = 0;
            card = card - 1;
            while(!visited[card]) {
                visited[card] = true;
                count++;
                card = cards[card] - 1;
            }
            answer.add(count);
        }
        if(answer.size() == 1) {
            return 0;
        }
        Collections.sort(answer, Comparator.reverseOrder());
        return answer.get(0) * answer.get(1);
    }
    
}