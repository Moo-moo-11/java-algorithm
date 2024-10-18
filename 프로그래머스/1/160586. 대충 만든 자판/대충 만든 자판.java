import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                if (map.containsKey(ch)) {
                    if (map.get(ch) > i + 1) {
                        map.put(ch, i + 1);
                    }
                } else {
                    map.put(ch, i + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int score = 0;
            for (char ch : target.toCharArray()) {
                if (map.get(ch) != null) {
                    score += map.get(ch);
                } else {
                    score = -1;
                    break;
                }
            }
            answer[i] = score;
        }
        
        return answer;
    }
}