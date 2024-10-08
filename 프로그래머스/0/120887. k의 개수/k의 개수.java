class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int x = i; x <= j; x++) {
            String[] strArray = Integer.toString(x).split("");
            for (String str: strArray) {
                if (str.equals(Integer.toString(k))) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}