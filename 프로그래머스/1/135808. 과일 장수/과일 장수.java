import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        int quantity = score.length / m;
        
        for (int i = 0; i < quantity; i++) {
            answer += m * score[score.length - m * (i + 1)];
        }
        
        return answer;
    }
}