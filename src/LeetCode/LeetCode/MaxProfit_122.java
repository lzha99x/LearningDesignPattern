package LeetCode.LeetCode;

/**
 * MaxProfit_122
 */


/**
 * 贪心算法
 * 时间复杂度o(n)
 * 空间复杂度o(1)
*/

public class MaxProfit_122 {

    int maxProfit1(int[] prices) {
        int ans = 0;
        int len = prices.length;

        for (int i = 1; i < len; i++) {
            ans += Math.max(0, prices[i] - prices[i-1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,10,3,6,4};
        int res = 0;

        MaxProfit_122 fun =  new MaxProfit_122();
        res = fun.maxProfit1(prices);

        System.out.println("Max Profit = " + res);
    }
}