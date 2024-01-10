package practise.normalQuestions.stringProblems;

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the  moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] splitString = s.trim().split("\\s+");
        String s1 = splitString[splitString.length - 1];
        return s1.length();
    }
}