class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int big = 0;
        int small = 0;
        
        for (int[] size: sizes) {
            int bigger = size[0] > size[1] ? size[0] : size[1];
            int smaller = size[0] > size[1] ? size[1] : size[0];
            
            if (bigger > big) {
                big = bigger;
            }
            
            if (smaller > small) {
                small = smaller;
            }
        }
        
        return big * small;
    }
}