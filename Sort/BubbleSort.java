import java.util.Arrays;

/**
 * @title: BubbleSort
 * @Author: Lux_er
 * @Date: 2021/11/10 0010 下午 8:30
 * @Description:
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    SortUtils.swap(arr, i, j);
                }
            }
        }
        SortUtils.printIntArray(arr);
    }
}
