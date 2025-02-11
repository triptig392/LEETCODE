class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;

        int minPrice = prices[0];

        for(int i=0; i<prices.length; i++){
            int currProfit = prices[i]-minPrice;
            profit = Math.max(currProfit, profit);
            minPrice = Math.min(prices[i], minPrice);
        }
        return profit;
    }
}