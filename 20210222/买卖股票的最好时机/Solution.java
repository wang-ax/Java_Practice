package 买卖股票的最好时机;

/**
 * ClassName 买卖股票的最好时机
 * Description TODO
 * Author 30712
 * Date 2021-02-22
 * Time 19:28
 */
public class Solution {
    //只有一次买入和卖出的机会
    //只有买入了才能卖出
    public int maxProfit (int[] prices) {
        // write code here
        if(prices == null || prices.length == 0){
            return 0;
        }
        /**
        int maxProfit = 0;
        int buy = prices[0];//刚开始买入
        for(int i =1;i < prices.length;i++){
            buy = Math.min(buy,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] - buy);
        }
        return maxProfit;*/
        int maxP =0;
        int min = prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                maxP = Math.max(maxP,prices[i]-min);
            }
        }
        return maxP;
    }
}
