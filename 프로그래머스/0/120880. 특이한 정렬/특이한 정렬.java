import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        double[] diff = new double[numlist.length];
        
        for (int i = 0; i < numlist.length; i++) {
            diff[i] = (n >= numlist[i]) ? n - numlist[i] + 0.1 : numlist[i] - n;
        }
        
        Arrays.sort(diff);
        
        for (int i = 0; i < diff.length; i++) {
            if (diff[i] % 1 == 0) {
                answer[i] = n + (int) diff[i];
            } else {
                answer[i] = n - (int) diff[i];
            }
        }
        
        return answer;
    }
}