import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        
        for (char ch : skip.toCharArray()) {
            list.add((int) ch);
        }

        for (char ch : s.toCharArray()) {
            int alphabet = ch;
            
            for (int i = 1; i <= index; i++) {
                while (true) {
                    alphabet++;
                    if (alphabet == 123) {
                        alphabet = 97;
                    }
                    
                    if (!list.contains(alphabet)) {
                        break;
                    }
                }
            }
            
            sb.append((char) alphabet);
        }
        
        return sb.toString();
    }
}