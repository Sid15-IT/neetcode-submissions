class Solution {
    public int maxProfit(int[] prices) {
        int cp = Integer.MAX_VALUE;
        int profit = 0;
        int currentProfit;
        for(int i=0;i<prices.length;i++){
            if(cp>prices[i])
            cp=prices[i];
            currentProfit=prices[i]-cp;
            if(currentProfit>profit){
                profit=currentProfit;
            }
        }
        return profit;
    }
}
