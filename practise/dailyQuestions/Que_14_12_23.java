package practise.dailyQuestions;

import java.util.HashMap;
import java.util.Map;

/*
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.The test cases are generated so that a unique mapping will always exist.

Example 1:
Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

Example 2:
Input: s = "1326#"
Output: "acz"
*/
public class Que_14_12_23 {
    public static void main(String[] args) {
        String s = "1326#";
        Map<String, String> alphaNumMap = new HashMap<>();
        alphaNumMap.put("1", "a");
        alphaNumMap.put("2", "b");
        alphaNumMap.put("3", "c");
        alphaNumMap.put("4", "d");
        alphaNumMap.put("5", "e");
        alphaNumMap.put("6", "f");
        alphaNumMap.put("7", "g");
        alphaNumMap.put("8", "h");
        alphaNumMap.put("9", "i");
        alphaNumMap.put("10#", "j");
        alphaNumMap.put("11#", "k");
        alphaNumMap.put("12#", "l");
        alphaNumMap.put("13#", "m");
        alphaNumMap.put("14#", "n");
        alphaNumMap.put("15#", "o");
        alphaNumMap.put("16#", "p");
        alphaNumMap.put("17#", "q");
        alphaNumMap.put("18#", "r");
        alphaNumMap.put("19#", "s");
        alphaNumMap.put("20#", "t");
        alphaNumMap.put("21#", "u");
        alphaNumMap.put("22#", "v");
        alphaNumMap.put("23#", "w");
        alphaNumMap.put("24#", "x");
        alphaNumMap.put("25#", "y");
        alphaNumMap.put("26#", "z");

        replaceAlpha(s, alphaNumMap);
    }

    private static void replaceAlpha(String s, Map<String, String> alphaNumMap) {
        int i = 0;
        StringBuilder sb = new StringBuilder(s);
        while (i < sb.length()) {
            if (i + 2 < sb.length() && sb.charAt(i + 2) == '#') {
                sb.replace(i, i + 3, alphaNumMap.get(sb.substring(i, i + 3)));
                i++;
                System.out.println(sb);
            } else {
                sb.replace(i, i + 1, alphaNumMap.get(sb.charAt(i) + ""));
                i++;
            }
            if (i == sb.length())
                break;
        }
    }
}
