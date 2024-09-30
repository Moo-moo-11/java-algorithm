class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for (String numb: number.split("")) {
            answer += Integer.parseInt(numb);
        }
        
        answer %= 9;
        
        return answer;
    }
}