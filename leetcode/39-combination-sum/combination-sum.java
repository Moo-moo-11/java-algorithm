class Solution {

    public void dfs(List<List<Integer>> answer, int[] candidates, int target,
    int index, Deque<Integer> path) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            answer.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(answer, candidates, target - candidates[i], i, path);
            path.removeLast();
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();

        dfs(answer, candidates, target, 0, new ArrayDeque<>());

        return answer;
    }
}