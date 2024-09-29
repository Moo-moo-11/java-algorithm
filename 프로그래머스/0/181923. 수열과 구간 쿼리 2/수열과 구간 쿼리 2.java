class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int x = 0; x < queries.length; x++) {
            int numb = -1;
            
            int s = queries[x][0];
            int e = queries[x][1];
            int k = queries[x][2];
            
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && (numb == -1 || arr[i] < numb)) {
                    numb = arr[i];
                }
            }
            
            answer[x] = numb;
        }
        
        return answer;
    }
}