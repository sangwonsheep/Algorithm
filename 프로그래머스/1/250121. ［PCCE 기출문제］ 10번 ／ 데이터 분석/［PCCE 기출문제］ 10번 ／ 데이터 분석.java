import java.util.*;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int numExt = convert(ext);
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < data.length; i++) {
            if(data[i][numExt] < val_ext) {
                list.add(data[i]);
            }
        }
        
        int sortIndex = convert(sort_by);
        
        list = list.stream()
            .sorted(Comparator.comparingInt(a -> a[sortIndex]))
            .collect(Collectors.toList());
        
        int[][] result = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
    
    public int convert(String ext) {
        if(ext.equals("code")) return 0;
        if(ext.equals("date")) return 1;
        if(ext.equals("maximum")) return 2;
        if(ext.equals("remain")) return 3;
        
        return -1;
    }
}