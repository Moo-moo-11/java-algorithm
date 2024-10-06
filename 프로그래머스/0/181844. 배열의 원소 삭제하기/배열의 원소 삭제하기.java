import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num: arr) {
            if (contain(delete_list, num)) {
                continue;
            }
            list.add(num);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public boolean contain(int[] arr, int num) {
        for (int i: arr) {
            if (i == num) {
                return true;
            }
        }
        
        return false;
    }
}