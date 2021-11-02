/**
 * @title: ShellSort
 * @Author: Lux_er
 * @Date: 2021/11/10 0010 下午 10:22
 * @Description:希尔排序:在gap值大即间隔大的时候,排序的次数要更少;在gap值小即间隔小时,排序移动的距离要更小,故比普通插入排序更省时
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        for (int gap = arr.length >> 1; gap > 0 ; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >= gap ; j -= gap) {
                    if(arr[j] < arr[j-gap]){
                        SortUtils.swap(arr,j,j-gap);
                    }
                }
            }
        }
        SortUtils.printIntArray(arr);
    }
}
// 可以优化gap
class ShellSort2{
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2,10};
        int h = 1;
        while(h <= arr.length / 3){
            h = h * 3 + 1;
        }
        for (int gap = h; gap > 0 ; gap = (gap-1) / 3) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >= gap ; j -= gap) {
                    if(arr[j] < arr[j-gap]){
                        SortUtils.swap(arr,j,j-gap);
                    }
                }
            }
        }
        SortUtils.printIntArray(arr);
    }
}
