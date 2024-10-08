import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sort = emergency.clone();
        
        Arrays.sort(sort);
        int size = emergency.length;
        
        for (int i = 0; i < size; i++){
            int e = sort[i];
            map.put(e, size-i);
        }
        
        for (int i = 0; i < size; i++){
            emergency[i] = map.get(emergency[i]);
        }
        
        return emergency;
    }
}