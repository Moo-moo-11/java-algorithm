class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int numb = arr[i];
            if (numb >= 50 && numb % 2 == 0) {
                arr[i] /= 2;
            } else if (numb < 50 && numb % 2 == 1) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
}