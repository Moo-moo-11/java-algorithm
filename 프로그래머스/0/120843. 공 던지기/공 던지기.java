class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        for (int i = 1; i <= k; i++) {
            if (i == 1) {
                answer = 1;
                continue;
            }
            
            answer += 2;
            
            if (answer > numbers.length) {
                answer -= numbers.length;
            }
        }
        
        return answer;
    }
}