import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int s: scoville) {
            queue.add(s);
        }
        
        if (queue.peek() >= K) {
            return 0;
        }
        
        int answer = 1;
        
        while (queue.size() >= 2) {
            queue.add(queue.poll() + (queue.poll() * 2));
            if (queue.peek() >= K) {
                return answer;
            }
            answer++;
        }
        
        return -1;
    }
}