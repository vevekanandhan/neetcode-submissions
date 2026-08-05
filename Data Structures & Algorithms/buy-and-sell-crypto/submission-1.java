class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxPrice = 0;

        while(r < prices.length)
        {
            if(prices[l] < prices[r])
            {
                int profit = prices[r] - prices[l];
                maxPrice = Math.max(profit, maxPrice);
            }
            else
            {
                l = r;
            }
            r++;
        }

        return maxPrice;
    }
}
