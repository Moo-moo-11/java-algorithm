class Solution {
    public long solution(int price, int money, int count) {
        long total = (long) price * (1 + count) * count / 2;
        return (money >= total) ? 0 : total - money;
    }
}