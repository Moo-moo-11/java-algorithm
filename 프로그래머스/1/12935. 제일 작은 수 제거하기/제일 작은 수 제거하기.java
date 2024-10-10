class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        int min = arr[0];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        } 
        
        int[] answer = new int[arr.length - 1];
        
        for (int i = 0; i < arr.length; i++) {
            if (i > idx) {
                answer[i - 1] = arr[i];
            } else if (i == idx) {
                continue;
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}