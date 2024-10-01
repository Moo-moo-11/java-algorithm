class Solution {
    public String solution(String my_string, int n) {
        int endIndex = my_string.length() - 1;
        int startIndex = endIndex - n + 1;
        String answer = my_string.substring(startIndex, endIndex + 1);
        return answer;
    }
}