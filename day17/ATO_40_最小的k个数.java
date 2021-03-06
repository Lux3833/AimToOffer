import java.util.PriorityQueue;

/**
 * @title: ATO_40_最小的k个数
 * @Author: Lux_er
 * @Date: 2021/11/3 0003 下午 8:55
 * @Description:输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

 * 示例 1：
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 *
 * 示例 2：
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 */
public class ATO_40_最小的k个数 {
    public static void main(String[] args) {

    }
}
// 最小堆
class Solution40{
    public int[] getLastNumbers(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}
