class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            while (true) {
                answer++;
                
                if (!Integer.toString(answer).contains("3") && answer % 3 != 0) {
                    break;
                } 
            }
        }
        
        return answer;
    }
}