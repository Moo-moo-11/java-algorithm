class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] leftCurrent = {0, 0};
        int[] rightCurrent = {2, 0};
        
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftCurrent[0] = 0;
                leftCurrent[1] = (number == 1) ? 3 : (number == 4) ? 2 : 1;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightCurrent[0] = 2;
                rightCurrent[1] = (number == 3) ? 3 : (number == 6) ? 2 : 1;
            } else {
                int[] current = {1, 0};
                if (number == 2 || number == 5 || number == 8) {
                    current[1] = 4 - (number + 1) / 3;
                }
                int left = Math.abs(current[0] - leftCurrent[0])
                    + Math.abs(current[1] - leftCurrent[1]);
                int right = Math.abs(current[0] - rightCurrent[0])
                    + Math.abs(current[1] - rightCurrent[1]);
                if (left == right) {
                    sb.append((hand.equals("left")) ? "L" : "R");
                    if (hand.equals("left")) {
                        leftCurrent[0] = current[0];
                        leftCurrent[1] = current[1];
                    } else {
                        rightCurrent[0] = current[0];
                        rightCurrent[1] = current[1];
                    }
                } else {
                    sb.append((left > right) ? "R" : "L");
                    if (right > left) {
                        leftCurrent[0] = current[0];
                        leftCurrent[1] = current[1];
                    } else {
                        rightCurrent[0] = current[0];
                        rightCurrent[1] = current[1];
                    }
                }
            }
        }
        
        return sb.toString();
    }
}