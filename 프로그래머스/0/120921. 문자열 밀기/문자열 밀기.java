class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int count = 0;
        boolean isPossible = false;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                sb.append(A.charAt((A.length() - i + j) % A.length()));
            }   
            
            if (sb.toString().equals(B)) {
                isPossible = true;
                break;
            }
            
            count++;
            sb.setLength(0);
        }
        
        if (isPossible) {
            answer = count;
        }
        
        return answer;
    }
}