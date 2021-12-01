package array;

import java.util.Arrays;

public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i=nums.length-1; i>=0; i--)
            if (nums[i] == val){
                for (int j=i; j<k-1; j++)
                    nums[j] = nums[j+1];
                k--;
            }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static int removeElement2(int[] nums, int val) {
        int k=0;

        for (int i=0; i<nums.length; i++)
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement2(nums, val));
        System.out.println("---");
        int[] nums2 = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums2, val));
    }
}
