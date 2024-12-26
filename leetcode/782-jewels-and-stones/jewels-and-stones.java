class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int answer = 0;

        Map<Character, Integer> maps = new HashMap<>();

        for (char s: stones.toCharArray()){
            if (maps.containsKey(s)) {
                maps.put(s, maps.get(s) + 1);
            } else {
                maps.put(s, 1);
            }
        }

        for (char j: jewels.toCharArray()) {
            if (maps.containsKey(j)) {
                answer += maps.get(j);
            }
        }
        
        return answer;
    }
}