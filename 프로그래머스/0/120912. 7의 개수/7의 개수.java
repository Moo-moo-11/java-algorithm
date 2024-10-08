class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i: array) {
            String str = Integer.toString(i);
            for (String numb: str.split("")) {
                if (numb.equals("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}