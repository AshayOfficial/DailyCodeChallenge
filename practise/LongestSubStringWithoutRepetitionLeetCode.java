package practise;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepetitionLeetCode {

    public static void main(String[] args) {
        String s = "";
        System.out.println(longestSubstring(s));
    }

    private static int longestSubstring(String s) {
        StringBuilder builder = new StringBuilder();
        List<Integer> integerList = new ArrayList<>();
        int first = 0;
        int length = 0;
        char[] charArray = s.toCharArray();

        if (s.isEmpty())
            return 0;
        for (int i = first; i < charArray.length; i++) {
            if (builder.lastIndexOf(String.valueOf(charArray[i])) == -1)
                builder.append(charArray[i]);
            else {
                integerList.add(builder.length());
                builder.delete(0, i);
                first++;
                i = first - 1;
            }
        }

        integerList.add(builder.length());
        for (Integer integer : integerList) {
            if (integer > length)
                length = integer;
        }
        return length;
    }

}

