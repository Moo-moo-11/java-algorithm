import java.util.Arrays;

class Solution {
    public String solution(String s) {
        if (s.length() == 1) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] != array[i + 1]) {
                    sb.append(array[i]);
                }
                
                continue;
            }
            
            if (i == array.length - 1) {
                if (array[i] != array[i - 1]) {
                    sb.append(array[i]);
                }
                
                continue;
            }
            
            if (array[i - 1] == array[i] || array[i] == array[i + 1]) {
                continue;
            }
            
            sb.append(array[i]);
        }
        
        return sb.toString();
    }
}