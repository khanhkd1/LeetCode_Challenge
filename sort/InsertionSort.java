package sort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++){
            int arr_i = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>arr_i){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = arr_i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,25,3,4,5,6,5};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
