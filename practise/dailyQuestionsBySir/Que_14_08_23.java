package practise.dailyQuestionsBySir;

import java.util.HashMap;
import java.util.Map;

public class Que_14_08_23 {
    /*
    * Given a number N. Your task is to check whether it is fascinating or not.
      Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated
      with the original number, then it results in all digits from 1 to 9 present exactly once.
      Example 1:
        Input:
        N = 192
        Output: Fascinating
        Explanation: After multiplication with 2
        and 3, and concatenating with original
        number, number will become 192384576
        which contains all digits from 1 to 9.
    */
    public static void main(String[] args) {
        int number = 192;
        if (number < 100) {
            System.out.println("NOT FASCINATING NUMBER");
            return;
        }
        if (fascinatingNo(number)) {
            System.out.println("FASCINATING NUMBER");
        } else {
            System.out.println("NOT FASCINATING NUMBER");
        }
    }

    private static boolean fascinatingNo(int number) {
        int mult;
        String finalString;

        mult = number * 2;
        finalString = number + String.valueOf(mult);
        mult = number * 3;
        finalString = finalString + mult;
        if (finalString.length() < 10) {

            int countOfNo = 0;
            Map<Character, Integer> noFreq = new HashMap<>();
            for (char i = 0; i < finalString.length(); i++) {
                if (!noFreq.containsKey(finalString.charAt(i)))
                    noFreq.put(finalString.charAt(i), countOfNo + 1);
                else return false;
            }
            return true;
        }
        else return false;
    }
}
