class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int y = 2 * a * b;        
        
        int answer = (x > y) ? x : y;
        return answer;
    }
}