class Solution {
    public int[] solution(int[] answers) {
        int[] answers1 = new int[answers.length];
        int[] answers2 = new int[answers.length];
        int[] answers3 = new int[answers.length];
        int[] score = new int[3];
        
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            answers1[i] = i % 5 + 1;
            answers2[i] = arr2[i % 8];
            answers3[i] = arr3[i % 10];
        }
        
        for (int i = 0; i < answers.length; i++) {
            if (answers1[i] == answers[i]) {
                score[0] += 1;
            }
            if (answers2[i] == answers[i]) {
                score[1] += 1;
            }
            if (answers3[i] == answers[i]) {
                score[2] += 1;
            }
        }
        
        int max = score[0];
        int count = 1;
        
        for (int i = 1; i <= 2; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] == max) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0;
        
        for (int i = 0; i <= 2; i++) {
            if (score[i] == max) {
                answer[idx] = i + 1;
                idx++;
            }
        }
        
        return answer;
    }
}