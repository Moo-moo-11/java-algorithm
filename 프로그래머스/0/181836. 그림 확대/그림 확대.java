class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch : picture[i].toCharArray()) {
                for (int j = 1; j <= k; j++) {
                    sb.append(ch);
                }
            }
            
            for (int x = i * k; x < i * k + k; x++) {
                answer[x] = sb.toString();
            }
        }
        
        return answer;
    }
}