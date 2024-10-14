class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        
        int max = Integer.valueOf(arr[0]);
        int min = Integer.valueOf(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            int numb = Integer.valueOf(arr[i]);
            
            if (numb > max) {
                max = numb;
            }
            
            if (numb < min) {
                min = numb;
            }
        }
        
        return min + " " + max;
    }
}