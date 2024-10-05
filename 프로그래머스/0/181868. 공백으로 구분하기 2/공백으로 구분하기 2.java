import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] strArr = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        
        for (String str: strArr) {
            if (str.equals("")) {
                continue;
            }
            list.add(str);
        }
        
        return list.toArray(new String[list.size()]);
    }
}