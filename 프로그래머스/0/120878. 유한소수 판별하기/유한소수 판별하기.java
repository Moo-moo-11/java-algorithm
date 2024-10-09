class Solution {
    public int solution(int a, int b) {
        int coDiviser = coDiviser(a, b);
       
        b /= coDiviser;
        
        while (true) {
            if (b % 2 != 0) {
                break;
            }
            b /= 2;
        }
        
        while (true) {
            if (b % 5 != 0) {
                break;
            }
            b /= 5;
        }
        
        return (b == 1) ? 1 : 2;
    }
    
    public int coDiviser (int a, int b) {        
        while (true) {
            if (a == b) return a;
            
            if (a > b) {
                if (a % b == 0) {
                    return b;
                }
                a = a % b;
            } else {
                if (b % a == 0) {
                    return a;
                }
                b = b % a;
            }
        }
    }
}