class Solution {
    public int solution(String s) {
        int answer = 0;
        int x = 0;
        int others = 0;
        char current = '0';
        
        for (char ch : s.toCharArray()) {
            
            if (current == '0') {
                current = ch;
                x += 1;
            } else if (current == ch) {
                x += 1;
            } else {
                others += 1;
            }
            
            if (x == others) {
                current = '0';
                x = 0;
                others = 0;
                answer += 1;
            }
        }
        
        if (x != 0) {
            answer += 1;
        }
        
        return answer;
    }
}