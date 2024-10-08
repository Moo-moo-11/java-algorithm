class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String input: keyinput) {
            if (input.equals("up")) {
                if (answer[1] == maxY) {
                    continue;
                }
                answer[1] += 1;
            } else if (input.equals("down")) {
                if (answer[1] == -maxY) {
                    continue;
                }
                answer[1] -= 1;
            } else if (input.equals("left")) {
                if (answer[0] == -maxX) {
                    continue;
                }
                answer[0] -= 1;
            } else {
                if (answer[0] == maxX) {
                    continue;
                }
                answer[0] += 1;
            }
        }
        
        return answer;
    }
}