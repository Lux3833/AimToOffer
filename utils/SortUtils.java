import java.util.Arrays;

/**
 * @title: SortUtils
 * @Author: Lux_er
 * @Date: 2021/11/10 0010 下午 8:33
 * @Description:
 */
public class SortUtils {
    public static void swap(int[] arr, int a, int b){
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printIntArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
