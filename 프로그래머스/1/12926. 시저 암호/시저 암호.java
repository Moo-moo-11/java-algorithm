class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch: s.toCharArray()) {
            if ('a' <= ch && ch <= 'z') {
                sb.append((char) ((ch + n - 97) % 26 + 97));
            } else if ('A' <= ch && ch <= 'Z') {
                sb.append((char) ((ch + n - 65) % 26 + 65));
            } else {
                sb.append(ch);
            }        
        }
        
        return sb.toString();
    }
}