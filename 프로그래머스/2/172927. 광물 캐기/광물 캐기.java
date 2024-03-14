import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int[][] weights = {{1,1,1},{5,1,1},{25,5,1}};
        
        int answer = 0;
        int pickCount = Arrays.stream(picks).sum();
        
        PriorityQueue<Group> groups = new PriorityQueue<>(Collections.reverseOrder());
        
        // 5개씩 묶은 그룹의 가중치 구하기
        for(int i = 0; i < minerals.length; i += 5) {
            Group group = new Group();
            group.list = new ArrayList<>();
            for(int j = i; j < i+5; j++) {
                if(j >= minerals.length)
                    break;
                
                if(minerals[j].equals("diamond")){
                    group.list.add(0); // 다이아
                    group.total += 25;
                }
                else if(minerals[j].equals("iron")){
                    group.list.add(1); // 철
                    group.total += 5;
                }
                else {
                    group.list.add(2); // 돌
                    group.total += 1;
                }
            }
            groups.add(group);
            
            if(groups.size() == pickCount)
                break;
        }
        
        while(!groups.isEmpty()) {
            Group group = groups.poll();
            int pick = -1;
            
            if(picks[0] > 0) { // 다이아 곡괭이 사용
                picks[0]--;
                pick = 0;
            }
            else if(picks[1] > 0) { // 철 곡괭이 사용
                picks[1]--;
                pick = 1;
            } 
            else if(picks[2] > 0) { // 돌 곡괭이 사용
                picks[2]--;
                pick = 2;
            }
            
            for(int n : group.list){
                answer += weights[pick][n];
            }
        }
        
        return answer;
    }
    
    static class Group implements Comparable<Group>{
        int total;
        ArrayList<Integer> list;
        
        @Override
        public int compareTo(Group group){
            return this.total - group.total;
        }
    }
}