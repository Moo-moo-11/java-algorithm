import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] array = {a,b,c,d};
        Arrays.sort(array);
        
        int answer = 0;
        
        if (array[0] == array[3]) {
            answer = 1111 * array[0];
        } else if (array[0] == array[2]) {
            answer = (int)Math.pow((10 * array[0] + array[3]), 2);
        } else if (array[1] == array[3]) {
            answer = (int)Math.pow((10 * array[1] + array[0]), 2);
        } else if (array [0] == array[1] && array[2] == array[3]) {
            answer = (array[0] + array[2]) * (array[2] - array[0]);
        } else if (array[0] == array[1]) {
            answer = array[2] * array[3];
        } else if (array[1] == array[2]) {
            answer = array[0] * array[3];
        } else if (array[2] == array[3]) {
            answer = array[0] * array[1];
        } else {
            answer = array[0];
        }
        
        return answer;
    }
}