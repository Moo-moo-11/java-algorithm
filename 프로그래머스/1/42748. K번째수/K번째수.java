import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int idx = 0; idx < commands.length; idx++) {
            int[] command = commands[idx];
            int i = command[0], j = command[1], k = command[2];
            
            int[] sub = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(sub);
            
            answer[idx] = sub[k - 1];
        }
        
        return answer;
    }
}