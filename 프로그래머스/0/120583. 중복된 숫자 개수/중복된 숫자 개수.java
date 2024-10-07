class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int numb: array) {
            if (numb == n) {
                answer++;
            }
        }
        
        return answer;
    }
}