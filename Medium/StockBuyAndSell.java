package Medium;
public class StockBuyAndSell {
    static int func(int[] prices){
        int maxProfit = 0;
        int mini = prices[0];
        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-mini;
            maxProfit =Math.max(maxProfit,profit);
            mini = Math.min(mini,prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] a = {7,6,4,3,1};
        int ans = func(a);
        System.out.println(ans);
    }
}
