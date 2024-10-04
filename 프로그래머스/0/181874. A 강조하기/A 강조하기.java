class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch: myString.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                sb.append('A');
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        return sb.toString();
    }
}