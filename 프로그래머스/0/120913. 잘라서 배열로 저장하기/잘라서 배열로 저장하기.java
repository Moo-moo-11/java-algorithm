class Solution {
    public String[] solution(String my_str, int n) {
        int size = (my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[size];
        
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                answer[i] = my_str.substring(i * n, my_str.length());
                continue;
            }
            
            answer[i] = my_str.substring(i * n,i * n + n);
        }
        
        return answer;
    }
}