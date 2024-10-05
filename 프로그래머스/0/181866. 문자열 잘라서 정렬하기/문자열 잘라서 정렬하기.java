import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        for (String str: strArr) {
            if (str.equals("")) {
                continue;
            }
            list.add(str);
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}