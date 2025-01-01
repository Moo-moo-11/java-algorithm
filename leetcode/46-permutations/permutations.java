class Solution {

    public void dfs(List<List<Integer>> answer, List<Integer> prevElements, List<Integer> elements) {

        if (elements.isEmpty()) {
            answer.add(prevElements.stream().collect(Collectors.toList()));
        }

        for (Integer e : elements) {
            List<Integer> nextElements = new ArrayList<>(elements);
            nextElements.remove(e);

            prevElements.add(e);
            dfs(answer, prevElements, nextElements);
            prevElements.remove(e);
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> elements = Arrays.stream(nums).boxed().collect(Collectors.toList());

        dfs(answer, new ArrayList<>(), elements);

        return answer;
    }
}