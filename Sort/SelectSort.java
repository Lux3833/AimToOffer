import java.util.Arrays;

/**
 * @title: SelectSort
 * @Author: Lux_er
 * @Date: 2021/11/10 0010 下午 7:50
 * @Description:
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        int minPos = 0;
        for (int i = 0; i < arr.length; i++) {
            minPos = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[minPos] > arr[j])
                    minPos = j;
            }
            if(minPos != i) {
                int temp = 0;
                temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
