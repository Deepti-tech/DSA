class Solution {
    public int maxProfit(int[] prices) {
        int diff=Integer.MIN_VALUE, curr=0, minPrice=Integer.MAX_VALUE;
        // for(int i=0; i<prices.length-1; i++){
        //     for(int j=i+1; j<prices.length; j++){
        //         if(diff<prices[j]-prices[i]){
        //             diff = prices[j]-prices[i];
        //         }
        //     }
        // }
        while(curr<prices.length){
            if(prices[curr]<minPrice){
                minPrice = prices[curr];
            }
            if(diff<prices[curr]-minPrice){
                diff = prices[curr]-minPrice;
            }
            curr++;
        }
        return diff>0 ? diff : 0;
    }
}