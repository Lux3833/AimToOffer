import java.util.Arrays;
import java.util.Scanner;

/**
 * @title: ATO_21_调整数组顺序使奇数位于偶数前面
 * @Author: Lux_er
 * @Date: 2021/11/1 0001 上午 10:35
 * @Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 *
 * 示例：
 *
 * 输入：nums =[1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 */
public class ATO_21_调整数组顺序使奇数位于偶数前面 {
    public static void main(String[] args) {
        Solution21 s21 = new Solution21();
        int[] nums = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        int[] res = s21.exchange(nums);
        System.out.println(Arrays.toString(res));
    }
}
class Solution21{
    public int[] exchange(int[] nums){
        int odd = 0;
        int even = nums.length-1;
        int temp;
        while(odd < even) {
            // while里的odd<even值得记忆,若没有它,需要在后面交换时添加 if(odd < even) 判断,避免遇到单调数组越界问题
            while(odd < even && (nums[odd] & 1) == 1) odd++;
            while(odd < even && (nums[even] & 1) == 0) even--;
            temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
        }
        return nums;

    }
}
