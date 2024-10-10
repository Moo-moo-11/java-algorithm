class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int commonDiv = commonDiv(n, m);
        
        answer[0] = commonDiv;
        
        answer[1] = n * m / commonDiv;
        
        return answer;
    }
    
    public int commonDiv(int a, int b) {
        while (true) {
            if (a > b) {
                int res = a % b;
                if (res == 0) {
                    return b;
                } else {
                    a = res;
                }
            } else if (b > a) {
                int res = b % a;
                if (res == 0) {
                    return a;
                } else {
                    b = res;
                }
            } else {
                return a;
            }
        }
    }
}