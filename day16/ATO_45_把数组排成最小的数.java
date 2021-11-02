/**
 * @title: ATO_45_把数组排成最小的数
 * @Author: Lux_er
 * @Date: 2021/11/2 0002 上午 10:57
 * @Description:输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 说明:
 * 输出结果可能非常大，所以你需要返回一个字符串而不是整数
 * 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0
 *
 * 示例 1:
 * 输入: [10,2]
 * 输出: "102"
 *
 * 示例2:
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 */
public class ATO_45_把数组排成最小的数 {
    public static void main(String[] args) {

    }
}
// 此题求拼接起来的最小数字，本质上是一个排序问题。设数组 nums 中任意两数字的字符串为 x 和 y ，则规定 排序判断规则 为：
// 若拼接字符串 x + y > y + x ，则 x “大于” y ；
// 反之，若 x + y < y + x ，则 x “小于” y ；
// x “小于” y 代表：排序完成后，数组中 x 应在 y 左边；“大于” 则反之。
class Solution45{
    public String minNumber(int[] nums){
        StringBuffer sb = new StringBuffer();
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }

    private void quickSort(String[] strs, int l, int r) {
        if(l >= r) return;
        int left = l;
        int right = r;
        String temp = strs[left];
        while(left < right){
            while((strs[right] + strs[l]).compareTo(strs[l] + strs[right]) >= 0 && left < right) right--;
            while((strs[left] + strs[l]).compareTo(strs[l] + strs[left]) <= 0 && left < right) left++;
            temp = strs[left];
            strs[left] = strs[right];
            strs[right] = temp;
        }
        strs[left] = strs[l];
        strs[l] = temp;
        quickSort(strs, l, left-1);
        quickSort(strs, left+1, r);
    }
}
