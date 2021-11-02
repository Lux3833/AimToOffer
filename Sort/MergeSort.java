/**
 * @title: MergeSort
 * @Author: Lux_er
 * @Date: 2021/11/12 0012 下午 4:18
 * @Description:
 */
public class MergeSort {
    public static void main(String[] args) {
        //int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        int[] arr = {1, 4, 6, 7, 10, 2, 3, 5, 8, 9};
        sort(arr,0,arr.length-1);
        SortUtils.printIntArray(arr);
    }
    private static void sort(int[] arr, int left, int right){
        if(left == right) return;
        // 分成两部分,左边排序,右边排序
        int mid = left + (right - left) / 2;
        sort(arr,left, mid);
        sort(arr,mid+1, right);
        merge(arr, left, mid+1, right);
    }
    private static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound){
        int mid = rightPtr - 1;
        int i = leftPtr;
        int j = rightPtr;
        int k = 0;
        int[] temp = new int[rightBound - leftPtr + 1];
        while(i <= mid && j <= rightBound){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
            // 上述代码可以换成: temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= rightBound) temp[k++] = arr[j++];
        for (int l = 0; l < temp.length; l++) {
            arr[leftPtr + l] = arr[l];
        }

    }
}
