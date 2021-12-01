package array;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder strB1 = new StringBuilder();
        StringBuilder strB2 = new StringBuilder();

        for (String str: word1)
            strB1.append(str);
        for (String str: word2)
            strB2.append(str);

        return strB1.toString().equals(strB2.toString());
    }

    public static void main(String[] args) {

    }

}
