import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (char ch: my_string.toCharArray()) {
            if ('0' <= ch && ch <= '9') {
                list.add(Character.getNumericValue(ch));
            }
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}