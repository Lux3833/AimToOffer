import java.util.Scanner;

/**
 * @title: ATO_63_股票的最大利润
 * @Author: Lux_er
 * @Date: 2021/10/31 0031 上午 9:31
 * @Description:假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class ATO_63_股票的最大利润 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        Solution63 ss = new Solution63();
        System.out.println(ss.maxProfit(prices));
    }
}
// 次次遍历,时间复杂度太高,办法太笨
class Solution63{
    public int maxProfit(int[] prices){
        int[] max = new int[1];
        for (int i = 0; i < prices.length; i++) {
            findMax(prices,i,max);
        }
        return max[0];
    }

    private void findMax(int[] prices, int i, int[] max) {
        for (int j = i; j < prices.length; j++) {
            if(prices[i] < prices[j] && (max[0] < prices[j] - prices[i])){
                max[0] = prices[j] - prices[i];
            }
        }
    }
}
// 一次遍历法,只需要记录历史最低点,然后判断什么时候卖利润最高就行
class Solution63_2 {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
// 动态规划
class Solution63_3{
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0; // 没有卖出的可能性
        // 定义状态，第i天卖出的最大收益
        int[] dp = new int[prices.length];
        dp[0] = 0;  // 初始边界
        int cost = prices[0]; // 成本
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - cost);
            // 选择较小的成本买入
            cost = Math.min(cost, prices[i]);
        }

        return dp[prices.length - 1];
    }
}
