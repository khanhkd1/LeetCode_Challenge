package sort;

import java.util.Arrays;

public class Bubble_Sort {
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            boolean sorted = true;
            for (int j=0; j<n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    sorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            if (sorted)
                break;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
