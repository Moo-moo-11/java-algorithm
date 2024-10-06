class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int x = 0;
        int y = 0;
        char direction = 'e';
        int count = 1;
        
        while (true) {
            if (count > n * n) {
                break;
            }
            switch (direction) {
                case 'e': {
                    answer[x][y] = count;
                    if (y == n - 1 || answer[x][y + 1] != 0) {
                        direction = 's';
                        x += 1;
                        count++;
                    } else {
                        y += 1;
                        count++;
                    }
                    break;
                }
                case 's': {
                    answer[x][y] = count;
                    if (x == n - 1 || answer[x + 1][y] != 0) {
                        direction = 'w';
                        y -= 1;
                        count++;
                    } else {
                        x += 1;
                        count++;
                    }
                    break;
                }
                case 'w': {
                    answer[x][y] = count;
                    if (y == 0 || answer[x][y - 1] != 0) {
                        direction = 'n';
                        x -= 1;
                        count++;
                    } else {
                        y -= 1;
                        count++;
                    }
                    break;
                }
                case 'n': {
                    answer[x][y] = count;
                    if (x == 0 || answer[x - 1][y] != 0) {
                        direction = 'e';
                        y += 1;
                        count++;
                    } else {
                        x -= 1;
                        count++;
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}