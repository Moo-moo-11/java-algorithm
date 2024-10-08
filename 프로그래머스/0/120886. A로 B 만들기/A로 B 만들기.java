import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        before = new String(beforeArr);
        after = new String(afterArr);
        
        return (before.equals(after)) ? 1 : 0;
    }
}