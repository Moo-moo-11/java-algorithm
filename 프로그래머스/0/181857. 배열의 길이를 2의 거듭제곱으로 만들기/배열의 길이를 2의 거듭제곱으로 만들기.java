class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int x = 1;
        
        while (true) {
            if (size <= x) {
                break;
            }
            
            x *= 2;
        }
        
        int[] answer = new int[x];
        
        for (int i = 0; i < x; i++) {
            if (i < size) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
}