import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] result = new char[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            result[i] = Character.toLowerCase(my_string.charAt(i));            
        }
        
        Arrays.sort(result);
        
        return new String(result);
    }
}