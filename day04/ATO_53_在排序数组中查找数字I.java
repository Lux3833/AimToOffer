import java.util.HashMap;
import java.util.Map;

/**
 * @title: ATO_53_在排序数组中查找数字I
 * @Author: Lux_er
 * @Date: 2021/10/21 21:16
 * @Description:统计一个数字在排序数组中出现的次数。
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 *
 * 示例2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 */
public class ATO_53_在排序数组中查找数字I {
    public static void main(String[] args) {

    }
}
class Solution53{
    public int search(int[] nums, int target){
        Map<Integer,Integer> mapTarget = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(mapTarget.containsKey(nums[i])){
                int count = mapTarget.get(nums[i]);
                mapTarget.put(nums[i],++count);
            }else{
                mapTarget.put(nums[i],1);
            }
        }
        if(mapTarget.containsKey(target)){
            return mapTarget.get(target);
        }else{
            return 0;
        }
    }
}
