import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String str: intStrs) {
            int number = Integer.parseInt(str.substring(s, s + l));
            if (number > k) {
                list.add(number);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}