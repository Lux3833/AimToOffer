/**
 * @title: ATO_11_旋转数组的最小数字
 * @Author: Lux_er
 * @Date: 2021/10/22 0022 上午 10:03
 * @Description:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 * 示例 1：
 * 输入：[3,4,5,1,2]
 * 输出：1
 *
 * 示例 2：
 * 输入：[2,2,2,0,1]
 * 输出：0
 */
public class ATO_11_旋转数组的最小数字 {
    public static void main(String[] args) {

    }
}
// 逆序遍历数组
class Solution11{
    public int minArray(int[] numbers){
        int len = numbers.length;
        int res = numbers[len-1];
        for (int i = len-1; i >= 0; i--) {
            if(i == 0){
                res = numbers[i];
                break;
            }
            if(numbers[i] >= numbers[i-1]){
                continue;
            }
            res = numbers[i];
            break;
        }
        return res;
    }
}
// 二分法查找
class Solution11_2{
    public int minArray(int[] numbers){
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2; //防止溢出
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}