class Solution {
    public int solution(int price) {
        int answer = price;
        
        if (price >= 500000) {
            answer = 80 * price / 100;
        } else if (price >= 300000) {
            answer = 90 * price / 100;
        } else if (price >= 100000) {
            answer = 95 * price / 100;
        }
        
        return answer;
    }
}