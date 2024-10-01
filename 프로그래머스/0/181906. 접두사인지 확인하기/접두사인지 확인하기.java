class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            String prefix = my_string.substring(0, i + 1);
            if (prefix.equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}