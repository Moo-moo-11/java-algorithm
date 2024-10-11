class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        boolean isEven = true;
        
        for (char ch: s.toCharArray()) {
            if (ch == ' ') {
                sb.append(ch);
                isEven = true;
            } else if (isEven) {
                sb.append(Character.toUpperCase(ch));
                isEven = false;
            } else {
                sb.append(Character.toLowerCase(ch));
                isEven = true;
            }
        }
        
        return sb.toString();
    }
}