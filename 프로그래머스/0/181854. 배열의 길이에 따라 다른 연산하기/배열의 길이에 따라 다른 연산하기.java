class Solution {
    public int[] solution(int[] arr, int n) {
        int size = arr.length;
        
        if (size % 2 == 1) {
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    arr[i] += n;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (i % 2 == 1) {
                    arr[i] += n;
                }
            }
        }
        
        return arr;
    }
}