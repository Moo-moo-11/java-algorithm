import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        
        while (true) {
            int[] temp = arr.clone();
            for (int i = 0; i < arr.length; i++) {
                int numb = temp[i];
                if (numb >= 50 && numb % 2 == 0) {
                    temp[i] /= 2;
                } else if (numb < 50 && numb % 2 == 1) {
                    temp[i] = temp[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, temp)) {
                break;
            }
            arr = temp;
            count++;
        }
        
        return count;
    }
}