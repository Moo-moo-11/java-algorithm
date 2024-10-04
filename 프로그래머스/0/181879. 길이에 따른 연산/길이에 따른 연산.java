class Solution {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            int answer = 0;
            for (int num: num_list) {
                answer += num;
            }
            return answer;
        } else {
            int answer = 1;
            for (int num: num_list) {
                answer *= num;
            }
            return answer;
        }
    }
}