class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int[] score = new int[3];
        int index = 0;
        
        for (int i = 0; i < dartResult.length() - 1; i++) {
            char next = dartResult.charAt(i + 1);
            char ch = dartResult.charAt(i);
            
            if (next == 'S' || next == 'D' || next == 'T') {
                sb.append(ch);
                score[index] = Integer.valueOf(sb.toString());
                sb.setLength(0);
                
                switch (next) {
                    case 'S' : {
                        answer += score[index];
                        break;
                    }
                    case 'D' : {
                        score[index] = score[index] * score[index];
                        answer += score[index];
                        break;
                    }
                    case 'T' : {
                        score[index] = score[index] * score[index] * score[index];
                        answer += score[index];
                    break;
                    }
                }
                index++;
                continue;
            }
            
            if (next == '*') {
                if (index == 1) {
                    answer += score[index - 1];
                    score[index - 1] *= 2;
                } else {
                    answer += score[index - 2] + score[index - 1];
                    score[index - 2] *= 2;
                    score[index - 1] *= 2;
                }
            }
            
            if (next == '#') {
                answer -= 2 * score[index - 1];
                score[index - 1] = -score[index - 1];
            }
            
            if ('0' <= ch && ch <= '9') {
                sb.append(ch);
            }
        }
        
        return answer;
    }
}