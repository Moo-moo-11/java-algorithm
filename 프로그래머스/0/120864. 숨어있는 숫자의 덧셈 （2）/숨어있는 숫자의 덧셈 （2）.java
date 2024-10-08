class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArray = my_string.replaceAll("[a-zA-Z]"," ").trim().split(" ");
        
        for (String str: strArray) {
            if (!str.equals("")) {
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}