import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        // Map<장르, Map<곡 id, 곡 재생횟수>> 구조
        Map<String, Map<Integer, Integer>> maps = new HashMap<>();
        // Map<장르, 곡 총 재생횟수> 구조
        Map<String, Integer> sum_plays = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            maps.put(genres[i], new HashMap<>());
        }

        // 장르별 곡 ID, 곡 재생횟수 생성
        for(int i = 0; i < genres.length; i++) {
            Map<Integer, Integer> map = maps.get(genres[i]);
            map.put(i, plays[i]);
        }

        // 장르별 곡 총 재생횟수 생성
        for(String s : maps.keySet()) {
            sum_plays.put(s, maps.get(s).values().stream().mapToInt(n -> n).sum());
        }

        List<String> map_list = new ArrayList<>(sum_plays.keySet());
        // 장르별 총 재생횟수를 기준으로 내림차순 정렬
        map_list.sort(((o1, o2) -> (sum_plays.get(o2).compareTo(sum_plays.get(o1)))));

        for(int i = 0; i < map_list.size(); i++) {
            Map<Integer, Integer> map = maps.get(map_list.get(i));

            List<Integer> list = new ArrayList<>(map.keySet());
            // 곡 재생횟수 기준으로 내림차순 정렬
            list.sort(((o1, o2) -> (map.get(o2).compareTo(map.get(o1)))));

            if(list.size() <= 1) {
                answer.add(list.get(0));
            }
            else {
                answer.add(list.get(0));
                answer.add(list.get(1));
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}