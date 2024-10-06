class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch: n_str.toCharArray()) {
            if (sb.length() == 0 && ch == '0') {
                continue;
            }
            sb.append(ch);
        }
        
        return sb.toString();
    }
}