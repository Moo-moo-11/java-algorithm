class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray();
        
        char[] temp = charArray.clone();
        for (int i = s; i <= e; i++) {
            charArray[i] = temp[s + e - i];
        }
        
        return new String(charArray);
    }
}