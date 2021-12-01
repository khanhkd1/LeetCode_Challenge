package array;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums)
            if (String.valueOf(num).length() % 2 == 0)
                count++;

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
