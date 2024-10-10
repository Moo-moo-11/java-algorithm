class Solution {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        
        int sum = 0;
        
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        
        return (x % sum == 0) ? true : false;
    }
}