class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            String str = my_strings[i];
            int a = parts[i][0];
            int b = parts[i][1];
            
            sb.append(str.substring(a,b + 1));
        }
        
        return sb.toString();
    }
}