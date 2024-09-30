class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();
        
        for (int[] query: queries) {
            char[] temp = charArray.clone();
            for (int i = query[0]; i <= query[1]; i++) {
                charArray[i] = temp[query[1] + query[0] - i];
            }
        }
        
        return String.valueOf(charArray);
    }
}