class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        
        if (dots[0][0] != dots[1][0]) {
            width = (dots[1][0] > dots[0][0]) ? dots[1][0] - dots[0][0] : dots[0][0] - dots[1][0];
        } else {
            width = (dots[2][0] > dots[0][0]) ? dots[2][0] - dots[0][0] : dots[0][0] - dots[2][0];
        }
        
        if (dots[0][1] != dots[1][1]) {
            height = (dots[1][1] > dots[0][1]) ? dots[1][1] - dots[0][1] : dots[0][1] - dots[1][1];
        } else {
            height = (dots[2][1] > dots[0][1]) ? dots[2][1] - dots[0][1] : dots[0][1] - dots[2][1];
        }
        
        return width * height;
    }
}