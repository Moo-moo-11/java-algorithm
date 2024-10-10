class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == 'p' || ch == 'P') {
                p += 1;
            } else if (ch == 'y' || ch == 'Y') {
                y += 1;
            }
        }

        return (p == y) ? true : false;
    }
}