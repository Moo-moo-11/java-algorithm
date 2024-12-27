class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> maps = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        for (char ch: s.toCharArray()) {
            if (maps.containsKey(ch) && left <= maps.get(ch)) {
                left = maps.get(ch) + 1;
            } else {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            maps.put(ch, right);
            right++;
        }
        
        return maxLength;
    }
}