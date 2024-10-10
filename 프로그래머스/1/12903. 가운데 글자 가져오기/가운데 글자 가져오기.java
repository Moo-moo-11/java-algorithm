class Solution {
    public String solution(String s) {
        int length = s.length();
        if (length % 2 == 0) {
            return s.substring(length / 2 - 1, length / 2 + 1);
        } else {
            return s.substring((length - 1) / 2, (length - 1) / 2 + 1);
        }
    }
}