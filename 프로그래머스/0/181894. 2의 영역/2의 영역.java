class Solution {
    public int[] solution(int[] arr) {
        int first = -1;
        int last = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (first == -1 && arr[i] == 2) {
                first = i;
            } else if (first != -1 && arr[i] == 2) {
                last = i;
            }
        }
        
        if (first == -1 && last == -1) {
            return new int[] {-1};
        } else if (first != -1 && last == -1) {
            return new int[] {2};
        } else {
            int[] answer = new int[last - first + 1];
            for (int i = first; i <= last; i++) {
                answer[i - first] = arr[i];
            }
            return answer;
        }
    }
}