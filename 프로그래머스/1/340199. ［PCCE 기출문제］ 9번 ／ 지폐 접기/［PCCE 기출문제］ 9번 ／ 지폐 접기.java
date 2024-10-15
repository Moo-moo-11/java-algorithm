import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        int bigWallet = wallet[1];
        int smallWallet = wallet[0];
        
        int big = bill[1];
        int small = bill[0];
        
        while (bigWallet < big || smallWallet < small) {
            big = big / 2;
            
            if (small > big) {
                int temp = big;
                big = small;
                small = temp;
            }
            
            answer++;
        }
        
        return answer;
    }
}