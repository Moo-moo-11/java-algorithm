class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String number = Integer.toString(num);
        String[] strArray = number.split("");
        
        for (int i = 0; i < number.length(); i++) {
            if (strArray[i].equals(Integer.toString(k))) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}