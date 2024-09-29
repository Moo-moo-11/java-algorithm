import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String str = Integer.toString(i);
            boolean bool = true;
            
            for (char ch : str.toCharArray()) {
                if (ch != '0' && ch != '5') {
                    bool = false;
                    break;
                }
            }
            
            if (bool) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}