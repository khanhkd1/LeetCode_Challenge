package array;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[26];
        for (int i=0; i<arr.length; i++)
            count[(int)arr[i]-97] ++;
        for (int i=0; i<arr.length; i++)
            if (count[(int)arr[i]-97] == 1)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
