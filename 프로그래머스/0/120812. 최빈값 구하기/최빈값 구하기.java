import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int max = 0;
        int frequency = 0;
        int beforeValue = -1;
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {            
            if (beforeValue != array[i]) {
                frequency = 1;
            } else {
                frequency++;
            }
            
            if (frequency > max) {
                max = frequency;
                answer = array[i];
            } else if (frequency == max) {
                answer = -1;
            }
            
            beforeValue = array[i];
        }
        
        return answer;
    }
}