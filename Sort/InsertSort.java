/**
 * @title: InsertSort
 * @Author: Lux_er
 * @Date: 2021/11/10 0010 下午 9:00
 * @Description:
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            int index = i+1;
            while(index < arr.length && index-1 > -1 && arr[index] < arr[index-1]){
                SortUtils.swap(arr, index, index-1);
                index--;
            }
        }
        SortUtils.printIntArray(arr);
    }
}
