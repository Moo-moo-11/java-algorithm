class Solution {
    int left;
    int maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();

        if (len == 1) return s;

        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i + 1);
            extendPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLen);
    }

    public void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }
}