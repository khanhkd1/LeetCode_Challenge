package sort;

import java.util.Arrays;

public class _912_Sort_an_Array_Merge_Sort {
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int[] mergeSort(int[] nums, int iLeft, int iRight) {
        if (iLeft == iRight){
            return new int[]{nums[iLeft]};
        }
        int iMid = (iLeft+iRight)/2;
        int[] nums1 = mergeSort(nums, iLeft, iMid);
        int[] nums2 = mergeSort(nums, iMid+1, iRight);

        return merge(nums1, nums2);
    }

    public static int[] merge(int[] nums1, int[] nums2){
        int n = nums1.length + nums2.length;
        int[] result = new int[n];
        int iResult = 0, iNums1 = 0, iNums2 = 0;
        while (iResult < n){
            if (iNums1 < nums1.length && iNums2 < nums2.length){ // nums1, nums2 còn phần tử
                if (nums1[iNums1] <= nums2[iNums2]){
                    result[iResult] = nums1[iNums1];
                    iNums1++; iResult++;
                } else {
                    result[iResult] = nums2[iNums2];
                    iNums2++; iResult++;
                }
            } else { // nums1 hoặc nums2 hết phần tử
                if (iNums1 < nums1.length){ // nums1 còn phần tử
                    result[iResult] = nums1[iNums1];
                    iNums1++; iResult++;
                } else { // nums2 còn phần tử
                    result[iResult] = nums2[iNums2];
                    iNums2++; iResult++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,4,21,5,3,5};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
