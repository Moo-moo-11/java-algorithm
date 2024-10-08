class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] array = my_string.split(" ");
        boolean isPlus = true;
        
        for (String str: array) {
            if (str.equals("+")) {
                isPlus = true;
            } else if (str.equals("-")) {
                isPlus = false;
            } else if (isPlus) {
                answer += Integer.parseInt(str);
            } else {
                answer -= Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}