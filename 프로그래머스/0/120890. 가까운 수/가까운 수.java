import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        Arrays.sort(array);        
        
        int answer = array[0];
        int diff = (n > array[0]) ? n - array[0] : array[0] - n;
        
        for (int i = array.length - 1; i >= 0; i--) {
            int x = (n > array[i]) ? n - array[i] : array[i] - n;
            
            if (x <= diff) {
                diff = x;
                answer = array[i];
            }
        }
        
        return answer;
    }
}