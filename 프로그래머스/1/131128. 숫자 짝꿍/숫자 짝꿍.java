import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map <Character, Integer> x = new HashMap<>();
        Map <Character, Integer> y = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Boolean onlyZeros = true;
        
        for (char ch : X.toCharArray()) {
            x.put(ch, x.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : Y.toCharArray()) {
            y.put(ch, y.getOrDefault(ch, 0) + 1);
        }
        
        for (int i = 9; i >= 0; i--) {
            Character ch = Character.forDigit(i, 10);
            int common = Math.min(x.getOrDefault(ch, 0), y.getOrDefault(ch, 0));
            for (int j = 1; j <= common; j++) {
                sb.append(ch);
                if (i != 0) {
                    onlyZeros = false;
                }
            }
        }
        
        if (sb.length() == 0) {
            return "-1";
        }
        
        if (onlyZeros) {
            return "0";
        }
        
        return sb.toString();
    }
}