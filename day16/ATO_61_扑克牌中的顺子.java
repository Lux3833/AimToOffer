import java.util.Arrays;

/**
 * @title: ATO_61_扑克牌中的顺子
 * @Author: Lux_er
 * @Date: 2021/11/2 0002 下午 2:35
 * @Description:从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 * 示例1:
 * 输入: [1,2,3,4,5]
 * 输出: True
 *
 * 示例2:
 * 输入: [0,0,1,2,5]
 * 输出: True
 */
public class ATO_61_扑克牌中的顺子 {
    public static void main(String[] args) {

    }
}
// 注意大小王可重复,其他牌不可重复
// 重点在于最大值和最小值的差值 < 5
class Solution61{
    public boolean isStraight(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0;i < 4;i++){
            if(nums[i] == 0){
                count++;
                continue;
            }else if(nums[i] == nums[i+1]){
                return false;
            }
        }
        return nums[4] - nums[count] < 5;
    }
}
