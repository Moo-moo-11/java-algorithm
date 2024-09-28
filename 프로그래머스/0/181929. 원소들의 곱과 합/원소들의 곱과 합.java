class Solution {
    public int solution(int[] num_list) {
        int result1 = 1;
        int result2 = 0;
        
        for (int numb: num_list) {
            result1 *= numb;
            result2 += numb;
        }
        
        result2 = result2 * result2;
        
        return (result1 < result2) ? 1 : 0;
    }
}