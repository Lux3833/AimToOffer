import java.util.Arrays;
import java.util.Scanner;

/**
 * @title: ATO_57_和为s的两个数字
 * @Author: Lux_er
 * @Date: 2021/11/1 0001 上午 11:09
 * @Description:输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 *
 * 示例 2：
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 */
public class ATO_57_和为s的两个数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Solution57 s57 = new Solution57();
        int[] res = s57.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
class Solution57{
    public int[] twoSum(int[] nums, int target){
        int first = 0;
        int second = nums.length-1;
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            first = i;
            while(nums[second] > target - nums[first]){
                second--;
            }
            if(nums[second] == target - nums[first]){
                res[0] = nums[first];
                res[1] = nums[second];
                break;
            }
        }
        return res;
    }
}
// 这个while循环更好,没有必要全部遍历一遍,耗时也比第一个更低
class Solution57_2{
    public int[] twoSum(int[] nums, int target){
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int s = nums[i] + nums[j];
            if(s < target) i++;
            else if(s > target) j--;
            else return new int[] { nums[i], nums[j] };
        }
        return new int[0];
    }
}