import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!map.containsKey(ch)) {
                map.put(ch, i);
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(ch);
                map.put(ch, i);
            }
        }
         
        return answer;
    }
}