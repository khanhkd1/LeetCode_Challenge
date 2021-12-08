package bsearch;

public class _704_Binary_Search {
    public static int search(int[] nums, int target) {
        int iLeft = 0, iRight = nums.length-1, iMid;
        while (iLeft <= iRight){
            iMid = (iLeft + iRight)/2;
            if (nums[iMid] == target)
                return iMid;
            else if (nums[iMid] < target)
                iLeft = iMid+1;
            else iRight = iMid-1;
        }
        return -1;
    }
}
