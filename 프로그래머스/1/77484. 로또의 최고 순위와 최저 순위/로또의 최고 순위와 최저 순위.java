import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int score = 0;
        int zeros = 0;
        
        for (int i : lottos) {               
            if (i == 0) {
                zeros += 1;
                continue;
            }
            
            for (int win : win_nums) {
                if (win == i) {
                    score += 1;
                    break;
                }
            }
        }
        
        int max = (7 - (score + zeros) == 7) ? 6 : 7 - (score + zeros);
        int min = (7 - score == 7) ? 6 : 7 - score;
        
        return new int[] {max, min};
    }
}