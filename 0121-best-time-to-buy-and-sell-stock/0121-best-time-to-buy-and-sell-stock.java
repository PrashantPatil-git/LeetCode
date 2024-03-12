class Solution {
    public int maxProfit(int[] prices) { 
        int minPrice=Integer.MAX_VALUE;  //buying stock
        int maxProfit=0;   

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){    //buying at min price
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice > maxProfit){ 
                 maxProfit=prices[i]-minPrice;  //selling at maxprofit
            }
        }
        return maxProfit;
    }
}