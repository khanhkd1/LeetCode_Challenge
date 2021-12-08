package sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        // Điều kiện dừng
        if (left >= right)
            return;
        // Bước 1: chọn key
        int key = arr[(left+right)/2];
        // Bước 2: phân bố lại mảng theo chốt (pivot)
        int pivot = partition(arr, left, right, key);
        System.out.println("left: " + left + ", right: " + right + ", key: " + key + ", pivot: " + pivot);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, left, right+1)));
        System.out.println("-------------------------");

        // Bước 3: chia đôi mảng, đệ qui lại
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot, right);

    }

    public static int partition(int[] arr, int left, int right, int key){
        int iLeft = left, iRight = right;
        while (iLeft <= iRight){
            // Nếu phần tử arr[iLeft] < key -> đúng vị trí -> tăng iLeft lên 1
            while (arr[iLeft] < key) iLeft++;
            // Nếu phần tử arr[iRight] > key -> đúng vị trí -> giảm iRight xuống 1
            while (arr[iRight] > key) iRight--;
            // Đổi chỗ 2 phần tử không đúng vị trí
            if (iLeft <= iRight){
                int temp = arr[iLeft];
                arr[iLeft] = arr[iRight];
                arr[iRight] = temp;
                iLeft++; iRight--;
            }
        }
        return iLeft;
    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,5,4,1,2,3};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
    }
}
