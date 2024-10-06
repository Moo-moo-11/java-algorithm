class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        if (row == col) {
            return arr;
        }
        
        int n = (row > col) ? row : col;
        
        int[][] answer = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < row && j < col) {
                    answer[i][j] = arr[i][j];
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        
        return answer;
    }
}