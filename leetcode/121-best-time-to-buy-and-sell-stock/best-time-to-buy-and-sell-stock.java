class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int price: prices) {
            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }

            minPrice = Math.min(minPrice, price); 
        }
        
        return maxProfit;
    }
}