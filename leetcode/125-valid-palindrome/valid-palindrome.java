class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch: s.toCharArray()) {
            if(Character.isAlphabetic(ch)||Character.isDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String str = sb.toString();
        String reverseStr = sb.reverse().toString();

        return str.equals(reverseStr);
    }
}