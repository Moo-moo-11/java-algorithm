class Solution {
    public String solution(String myString, String pat) {
        for (int i = myString.length() - pat.length(); i >= 0; i--) {
            String substr = myString.substring(i, i + pat.length());
            if (substr.equals(pat)) {
                return myString.substring(0, i + pat.length());
            }
        }
        return "";
    }
}