class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n, 3);
        
        three = new StringBuilder(three).reverse().toString();
        
        return Integer.parseInt(three, 3);
    }
}