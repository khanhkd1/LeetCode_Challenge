package array;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int num: nums2){
            insertNum(nums1, m, num);
            m++;
        }
    }

    private static void insertNum(int[] nums1, int m, int num) {
        boolean findK = false;
        for (int k=0; k<m; k++)
            if (nums1[k] > num){
                findK = true;
                for (int i=m; i>k; i--)
                    nums1[i] = nums1[i-1];
                nums1[k] = num;
                break;
            }
        if (!findK)
            nums1[m] = num;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,4,5,0,0,0};
        int[] nums2 = {0,2,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }
}
