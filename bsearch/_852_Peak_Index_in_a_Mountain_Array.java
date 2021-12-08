package bsearch;

public class _852_Peak_Index_in_a_Mountain_Array {
    public static int bSearch(int[] arr, int iLeft, int iRight){
        if (iRight - iLeft < 2)
            return -1;
        int iMid = (iLeft + iRight)/2;
        if (arr[iMid] > arr[iMid-1] && arr[iMid] > arr[iMid+1])
            return iMid;
        else if (arr[iMid] < arr[iMid-1])
            return bSearch(arr, iLeft, iMid);
        else
            return bSearch(arr, iMid, iRight);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        return bSearch(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
