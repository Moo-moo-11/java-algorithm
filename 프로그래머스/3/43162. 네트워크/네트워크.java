class Solution {
    int answer = 0;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, computers);
            }
        }
        
        return answer;
    }
    
    public void dfs (int i, int[][] computers) {
        visited[i] = true;
        
        for (int j = 0; j < computers.length; j++) {
            if (!visited[j] && computers[i][j] == 1) {
                dfs(j, computers);
            }
        }
    }
}