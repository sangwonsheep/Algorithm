import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int minIndex = 0;
        if(arr.length == 1){
            int [] check = {-1};
            return check;
        }
        int [] check = new int[arr.length-1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[minIndex])
                minIndex = i;
        }
        for(int i = minIndex+1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        for(int i = 0; i < check.length; i++){
            check[i] = arr[i];
        }
        return check;
    }
}