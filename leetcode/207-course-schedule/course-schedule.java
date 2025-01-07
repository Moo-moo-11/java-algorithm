class Solution {

    public boolean dfs(Map<Integer, List<Integer>> maps, Integer finish,
    List<Integer> takes, List<Integer> taken) {
        if (takes.contains(finish)) {
            return false;
        }

        if (taken.contains(finish)) {
            return true;
        }

        if (maps.containsKey(finish)) {
            takes.add(finish);
            
            for (Integer take : maps.get(finish)) {
                if (!dfs(maps, take, takes, taken)) {
                    return false;
                }
            }

            takes.remove(finish);
            taken.add(finish);
        }

        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> maps = new HashMap<>();

        for (int[] pre : prerequisites) {
            maps.putIfAbsent(pre[0], new ArrayList<>());
            maps.get(pre[0]).add(pre[1]);
        }

        List<Integer> takes = new ArrayList<>();
        List<Integer> taken = new ArrayList<>();

        for (Integer finish : maps.keySet()) {
            if (!dfs(maps, finish, takes, taken)) {
                return false;
            }
        }

        return true;
    }
}