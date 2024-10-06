import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char ch: myStr.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                }
                sb.setLength(0);
                continue;
            }
            sb.append(ch);
        }
        
        if (sb.length() != 0) {
            list.add(sb.toString());
        }
        
        if (list.size() == 0) {
            list.add("EMPTY");
        }
        
        return list.toArray(new String[list.size()]);
    }
}