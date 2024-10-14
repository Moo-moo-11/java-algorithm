import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (stack.peek() == '(' && ch == ')') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        
        return (stack.isEmpty()) ? true : false;
    }
}