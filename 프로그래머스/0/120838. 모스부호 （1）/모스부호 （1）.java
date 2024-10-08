class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        
        for (String ch: letter.split(" ")) {
            for (int i = 0; i <= 25; i++) {
                if (morse[i].equals(ch)) {
                    sb.append((char)('a' + i));
                }
            }
        }
        
        return sb.toString();
    }
}