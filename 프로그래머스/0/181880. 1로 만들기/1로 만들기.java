class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int num: num_list) {
            int count = 0;
            int temp = num;
            while (true) {
                if (temp == 1) {
                    break;
                }
                
                if (temp % 2 == 0) {
                    temp /= 2;
                    count++;
                } else {
                    temp = (temp - 1) / 2;
                    count++;
                }
            }
            answer += count;
        }
        
        return answer;
    }
}