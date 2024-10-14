import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int[] dayI = Arrays.copyOf(score, i + 1);
            
            Arrays.sort(dayI);
            
            if (dayI.length < k) {
                answer[i] = dayI[0];
            } else {
                answer[i] = dayI[dayI.length - k];
            }
        }
        
        return answer;
    }
}