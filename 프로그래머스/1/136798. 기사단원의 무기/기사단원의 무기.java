import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] knights = new int[number];
        
        for (int i = 0; i < number; i++) {
            int divisor = divisor(i + 1);
            
            knights[i] = (divisor > limit) ? power : divisor;
        }
        
        for (int knight : knights) {
            answer += knight;
        }
        
        return answer;
    }
    
    public int divisor(int numb) {
        int count = 0;
        
        for (int i = 1; i <= Math.sqrt(numb); i++) {
            if (numb % i == 0) {
                count += 2;
            }
        }
        
        if (Math.sqrt(numb) == (int) Math.sqrt(numb)) {
            count -= 1;
        }
        
        return count;
    }
}