class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int[] query: queries) {
            int idx1 = query[0];
            int idx2 = query[1];
            
            int val1 = answer[idx1];
            int val2 = answer[idx2];
            
            answer[idx2] = val1;
            answer[idx1] = val2;
        }
        
        return answer;
    }
}