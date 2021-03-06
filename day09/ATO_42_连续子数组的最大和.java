/**
 * @title: ATO_42_连续子数组的最大和
 * @Author: Lux_er
 * @Date: 2021/11/1 0001 下午 2:18
 * @Description:输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 *
 * 示例1:
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释:连续子数组[4,-1,2,1] 的和最大，为6。
 */
public class ATO_42_连续子数组的最大和 {
    public static void main(String[] args) {

    }
}
class Solution42{
    public int maxSubArray(int[] nums){
        int[] dp = new int[nums.length+1];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            max = max > dp[i] ? max : dp[i];
        }
        return max;
    }
}
