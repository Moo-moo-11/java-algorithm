class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int numb: array) {
            if (numb > height) {
                answer += 1;
            }
        }
        
        return answer;
    }
}