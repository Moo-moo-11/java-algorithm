import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] noClear = new int[N];
        int[] reach = new int[N];
        
        for (int i : stages) {
            for (int j = 0; j < i; j++) {
                if (j == N) {
                    break;
                }
                reach[j] += 1;
            }
            if (i == N + 1) {
                continue;
            }
            noClear[i - 1] += 1;
        }
        
        Map<Integer, Double> map = new HashMap<>();
        
        for (int i = 0; i < reach.length; i++) {
            if (reach[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double) noClear[i] / reach[i]);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(i -> i).toArray();
    }
}