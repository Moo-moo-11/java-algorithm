class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        int a = slicer[0], b = slicer[1], c = slicer[2];
        
        switch (n) {
            case 1 : {
                answer = new int[b + 1];
                for (int i = 0; i <= b; i++) {
                    answer[i] = num_list[i];
                }
                break;
            }
            case 2 : {
                answer = new int[num_list.length - a];
                for (int i = a; i < num_list.length; i++) {
                    answer[i - a] = num_list[i];
                }
                break;
            }
            case 3 : {
                answer = new int[b - a + 1];
                for (int i = a; i <= b; i++) {
                    answer[i - a] = num_list[i];
                }
                break;
            }
            default : {
                answer = new int[(b - a + c) / c];
                for (int i = a; i <= b; i++) {
                    if ((i - a) % c == 0) {
                        answer[(i - a) / c] = num_list[i];
                    }
                }
                break;
            }
        }
        
        return answer;
    }
}