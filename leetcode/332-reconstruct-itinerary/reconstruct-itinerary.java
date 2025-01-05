class Solution {

    public void dfs(List<String> answer, Map<String, PriorityQueue<String>> fromToMap, String from) {
        while (fromToMap.containsKey(from) && !fromToMap.get(from).isEmpty()) {
            dfs(answer, fromToMap, fromToMap.get(from).poll());
        }

        answer.add(0, from);
    }
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> answer = new LinkedList<>();
        Map<String, PriorityQueue<String>> fromToMap = new HashMap<>();

        for (List<String> ticket : tickets) {
            fromToMap.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            fromToMap.get(ticket.get(0)).add(ticket.get(1));
        }

        dfs(answer, fromToMap, "JFK");

        return answer;
    }
}