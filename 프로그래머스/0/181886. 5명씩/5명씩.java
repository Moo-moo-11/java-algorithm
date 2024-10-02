class Solution {
    public String[] solution(String[] names) {
        int numb = (names.length % 5 == 0) ? names.length / 5 : names.length / 5 + 1;
        String[] answer = new String[numb];
        
        for (int i = 0; i < numb; i++) {
            answer[i] = names[5 * i];
        }
        
        return answer;
    }
}