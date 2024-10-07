class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strings = my_string.replaceAll("[a-zA-Z]", "").split("");
        
        for (String str: strings) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}