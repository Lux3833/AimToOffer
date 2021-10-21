import java.util.HashMap;
import java.util.Map;

/**
 * @title: ATO_03_数组中重复的数字
 * @Author: Lux_er
 * @Date: 2021/10/21 0021 下午 7:05
 * @Description:找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class ATO_03_数组中重复的数字 {
    public static void main(String[] args) {

    }
}
class Solution03{
    public int findRepeatNumber(int[] nums){
        int[] count = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(++count[nums[i]] > 1){
                return nums[i];
            }
        }
        return 0;
    }
}
