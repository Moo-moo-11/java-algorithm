import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int count = 0;
        
        for (int i = 1; i <= rank.length; i++) {
            if (count == 3) {
                break;
            }
            
            int index = 0;
            for (int j = 0; j < rank.length; j++) {
                if (rank[j] == i) {
                    index = j;
                }
            }
            
            if (attendance[index]) {
                if (count == 0) {
                    answer += 10000 * index;
                } else if (count == 1) {
                    answer += 100 * index;
                } else {
                    answer += index;
                }
                count++;
            }
        }
        
        return answer;
    }
}