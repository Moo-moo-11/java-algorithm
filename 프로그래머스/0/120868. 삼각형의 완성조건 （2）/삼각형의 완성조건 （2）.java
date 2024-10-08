class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        for (int i = 1; i < sides[0] + sides[1]; i++) {
            if (i < sides[0] + sides[1] && sides[0] < i + sides[1] && sides[1] < i + sides[0]) {
                answer += 1;
            }
        }
        
        return answer;
    }
}