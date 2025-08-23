// Last updated: 8/23/2025, 10:24:06 AM
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int minPrice = Integer.MAX_VALUE;

        for(int i : prices) {
            if(i < minPrice) {
                minPrice = i;
            } else {
                maxProfit = Math.max(maxProfit, i - minPrice);
            }
        }
        return maxProfit;
    }
}