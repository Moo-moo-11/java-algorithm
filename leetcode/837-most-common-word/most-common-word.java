class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        Map<String, Integer> maps = new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        for (String word: words) {
            if (!ban.contains(word)) {
                maps.put(word, maps.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(maps.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}