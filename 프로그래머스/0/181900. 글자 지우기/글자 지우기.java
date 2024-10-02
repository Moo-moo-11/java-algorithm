class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        int[] indexArray = new int[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            indexArray[i] = i;
        }
        
        for (int i: indices) {
            indexArray[i] = -1;
        }
        
        for (int index: indexArray) {
            if (index == -1) {
                continue;
            }
            
            sb.append(my_string.charAt(index));
        }
        
        return sb.toString();
    }
}