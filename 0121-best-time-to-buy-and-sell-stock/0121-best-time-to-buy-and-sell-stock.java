class Solution {
    public int maxProfit(int[] prices) {
        int p = 0;
        int min = prices[0];
     for(int i=1;i<prices.length;i++){
         min = Math.min(min,prices[i]);
         p = Math.max(p, prices[i]-min);
     }
        return p;
    }
}