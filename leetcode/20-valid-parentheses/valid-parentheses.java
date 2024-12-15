class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> map = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        for (char ch: s.toCharArray()) {
            if (!map.containsKey(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || map.get(ch) != stack.pop()) {
                return false;
            }
        }

        return stack.size() == 0;
    }
}