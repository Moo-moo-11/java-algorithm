class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] x = lines[0], y = lines[1], z = lines[2];
        int a1 = x[0], b1 = x[1], a2 = y[0], b2 = y[1], a3 = z[0], b3 = z[1];
        
        int A1 = (a1 > a2) ? a1 : a2;
        int B1 = (b1 < b2) ? b1 : b2;
        int A2 = (a1 > a3) ? a1 : a3;
        int B2 = (b1 < b3) ? b1 : b3;
        int A3 = (a2 > a3) ? a2 : a3;
        int B3 = (b2 < b3) ? b2 : b3;
        
        if (A1 < B1) {
            answer += B1 - A1;
        }
        
        if (A2 < B2) {
            answer += B2 - A2;
        }
        
        if (A3 < B3) {
            answer += B3 - A3;
        }
        
        int commonA = (A1 > a3) ? A1 : a3;
        int commonB = (B1 < b3) ? B1 : b3;
        
        if (commonA < commonB) {
            answer -= (commonB - commonA) * 2;
        }
        
        return answer;
    }
}