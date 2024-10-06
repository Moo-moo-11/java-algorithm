import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (String str : strArr) {
            int length = str.length();
            if (map.containsKey(length)) {
                map.put(length, map.get(length) + 1);
            } else {
                map.put(length, 1);
            }
        }
        
        int max = 0;
        
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (max < count) {
                max = count;
            }
        }
        
        return max;
    }
}