class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int c = Integer.parseInt(arr[4]);
            String operator = arr[1];
            
            if (operator.equals("+")) {
                answer[i] = (a + b == c) ? "O" : "X";
            } else {
                answer[i] = (a - b == c) ? "O" : "X";
            }
        
        }
        
        return answer;
    }
}