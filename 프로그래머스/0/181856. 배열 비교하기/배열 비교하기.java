class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        
        if (size1 > size2) {
            return 1;
        } else if (size2 > size1) {
            return -1;
        }
        
        int sum1 = 0;
        int sum2 = 0;
        
        for (int numb: arr1) {
            sum1 += numb;
        }
        
        for (int numb: arr2) {
            sum2 += numb;
        }
        
        if (sum1 > sum2) {
            return 1;
        } else if (sum1 < sum2) {
            return -1;
        } else {
            return 0;
        }
    }
}