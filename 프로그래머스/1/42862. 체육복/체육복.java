import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }
        
        for (int i : lost) {
            map.put(i, 0);
        }
        
        for (int i : reserve) {
            map.put(i, map.get(i) + 1);
        }
        
        for (int i = 1; i <= n; i++) {
            if (map.get(i) >= 1) {
                answer++;
            } else {
                if (map.getOrDefault(i - 1, 0) == 2) {
                    map.put(i - 1, 1);
                    answer++;
                } else if (map.getOrDefault(i + 1, 0) == 2) {
                    map.put(i + 1, 1);
                    answer++;
                }
            }
        }
        
        return answer;
    }
}