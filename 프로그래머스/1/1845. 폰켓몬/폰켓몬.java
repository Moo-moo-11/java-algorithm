import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        return (set.size() > count) ? count : set.size();
    }
}