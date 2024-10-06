class Solution {
    public int solution(String num_str) {
        int sum = 0;
        
        for (String str: num_str.split("")) {
            int num = Integer.parseInt(str);
            sum += num;
        }
        
        return sum;
    }
}