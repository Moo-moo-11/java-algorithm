class Solution {
    public int solution(String[] babbling) {
        String[] strArr = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String babble: babbling) {
            for (String str: strArr) {
                babble = babble.replace(str, " ");
            }
            
            if (babble.trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}