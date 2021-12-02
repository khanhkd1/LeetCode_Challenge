package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int minIndex = i;
            for (int j=i+1; j<n; j++)
                if (arr[j] < arr[i])
                    minIndex = j;
            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,25,3,4,5,6,5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
