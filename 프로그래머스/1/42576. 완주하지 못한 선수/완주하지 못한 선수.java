import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String part : participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }

        for (String comp : completion) {
            int left = map.get(comp);
            if (left == 1) {
                map.remove(comp);
            } else {
                map.put(comp, left - 1);
            }
        }
        
        return map.entrySet().iterator().next().getKey();
    }
}