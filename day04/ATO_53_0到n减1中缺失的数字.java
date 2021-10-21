/**
 * @title: ATO_53_0到n减1中缺失的数字
 * @Author: Lux_er
 * @Date: 2021/10/21 21:30
 * @Description:一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * 示例 1:
 * 输入: [0,1,3]
 * 输出: 2
 *
 * 示例2:
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 */
public class ATO_53_0到n减1中缺失的数字 {
    public static void main(String[] args) {
    }
}
class Solution53_2{
    public int missingNumber(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == res){
                res++;
            }else{
                break;
            }
        }
        return res;
    }
}

