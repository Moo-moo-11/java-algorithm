class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long numP = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String substr = t.substring(i, i + p.length());
            long numT = Long.parseLong(substr);
            
            if (numT <= numP) {
                answer++;
            }
        }
        
        return answer;
    }
}