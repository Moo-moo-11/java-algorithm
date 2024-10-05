class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : myString.toCharArray()) {
            if (ch == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }
        
        String modifiedString = sb.toString();
        
        if (modifiedString.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}