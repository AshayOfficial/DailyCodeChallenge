package practise.dailyQuestionsBySir;

import java.util.Arrays;

public class Que_22_08_23 {
    /*
    Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are
    an anagram of each other or not. An anagram of a string is another string that contains the same characters, only
    the order of characters can be different. For example, act and tac are an anagram of each other.

    Note:-
    If the strings are anagrams you have to return True or else return False
    |s| represents the length of string s.

    Example 1:
    Input:a = geeksforgeeks, b = forgeeksgeeks
    Output: YES
    Explanation: Both the string have same characters with same frequency. So, both are anagrams.
    */
    public static void main(String[] args) {
        String s = "geeksforge e ks";
        String t = "forgeeksgeeks ";
        if (isAnagram(s, t))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s", "");
        t = t.replaceAll("\\s", "");
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] sArray = s.toLowerCase().toCharArray();
            char[] tArray = t.toLowerCase().toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            return Arrays.equals(sArray, tArray);
        }
    }
}
