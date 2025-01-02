class Solution {

    public void dfs(List<List<Integer>> answer, LinkedList<Integer> elements,
    int n, int start, int k) {

        if (k == 0) {
            answer.add(elements.stream().collect(Collectors.toList()));
            return;
        }

        for (int i = start; i <= n; i++) {
            elements.add(i);
            dfs(answer, elements, n, i + 1, k - 1);
            elements.removeLast();
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> answer = new ArrayList<>();

        dfs(answer, new LinkedList<>(), n, 1, k);

        return answer;
    }
}