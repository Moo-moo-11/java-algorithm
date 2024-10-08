class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorial = 1;
        
        while (true) {
            if (factorial * answer > n) {
                answer--;
                break;
            }
            
            factorial *= answer;
            answer++;
        }
        
        return answer;
    }
}