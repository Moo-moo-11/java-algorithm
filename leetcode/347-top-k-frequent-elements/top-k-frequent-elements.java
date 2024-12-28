class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int num : nums) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for (int key : maps.keySet()) {
            queue.add(new int[]{key, maps.get(key)});
        }

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = queue.poll()[0];
        }

        return answer;
    }
}