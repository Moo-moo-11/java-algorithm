import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String numb = String.valueOf(n);
        
        for (String str: numb.split("")) {
            answer += Integer.parseInt(str);
        }

        return answer;
    }
}