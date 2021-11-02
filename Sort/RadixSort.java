import java.util.Arrays;

/**
 * @title: RadixSort
 * @Author: Lux_er
 * @Date: 2021/11/18 0018 下午 7:47
 * @Description:
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {421, 240, 115, 532, 305, 430, 124};
        int[] res = sort(arr);
        SortUtils.printIntArray(res);
    }

    private static int[] sort(int[] arr) {
        int[] res = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < 3; i++) { // 3是最高位数
            int division = (int) Math.pow(10, i);
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / division % 10;
                count[num]++;
            }
            for (int m = 1; m < count.length; m++) {// 维持基数排序稳定性
                count[m] = count[m] + count[m - 1];
            }
            for (int n = arr.length - 1; n >= 0; n--) {
                int num = arr[n] / division % 10;
                res[--count[num]] = arr[n];
            }
            System.arraycopy(res, 0, arr, 0, arr.length);
            Arrays.fill(count, 0);
        }
        return res;
    }
}
