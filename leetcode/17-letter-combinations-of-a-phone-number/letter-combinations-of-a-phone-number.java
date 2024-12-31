class Solution {
    public void dfs(List<String> answer, Map<Character, List<Character>> map,
    String digits, int index, StringBuilder path) {
        if (path.length() == digits.length()) {
            answer.add(String.valueOf(path));
            return;
        }

        for (Character ch: map.get(digits.charAt(index))) {
            dfs(answer, map, digits, index + 1, new StringBuilder(path).append(ch));
        }
    }

    public List<String> letterCombinations(String digits) {
        List <String> answer = new ArrayList<>();

        if (digits.length() == 0) {
            return answer;
        }

        Map<Character, List<Character>> map = new HashMap<>();
        map.put('2', List.of('a','b','c'));
        map.put('3', List.of('d','e','f'));
        map.put('4', List.of('g','h','i'));
        map.put('5', List.of('j','k','l'));
        map.put('6', List.of('m','n','o'));
        map.put('7', List.of('p','q','r','s'));
        map.put('8', List.of('t','u','v'));
        map.put('9', List.of('w','x','y','z'));

        dfs(answer, map, digits, 0, new StringBuilder());
        return answer;
    }
}