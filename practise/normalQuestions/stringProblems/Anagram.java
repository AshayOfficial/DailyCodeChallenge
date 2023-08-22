package practise.normalQuestions.stringProblems;

import java.util.Arrays;

public class Anagram {
    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
    all the original letters exactly once.

    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true
    */
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (isAnagram(s, t))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static boolean isAnagram(String s, String t) {
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
