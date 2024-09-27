class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int y = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        int answer = (x > y) ? x : y;
        return answer;
    }
}