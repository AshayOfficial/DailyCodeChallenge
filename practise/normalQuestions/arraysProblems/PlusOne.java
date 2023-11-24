package practise.normalQuestions.arraysProblems;

import java.util.Arrays;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4].
*/
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {5,8,7,8,8};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int sum;
        int firstDigit = digits[0];
        if (digits.length > 1) {
            for (int i = digits.length - 1; i >= 0; i--) {
                sum = digits[i] + 1;
                if (sum > 9 && (i - 1) >= 0) {
                    digits[i] = 0;
                    if (digits[i - 1] != 9) {
                        digits[i - 1] = digits[i - 1] + 1;
                        break;
                    } else digits[i - 1] = digits[i - 1] + 1;
                } else if (sum <= 9) {
                    digits[i] = sum;
                    break;
                }
            }
            if (digits[0] > 9) {
                int[] digitsNew = new int[digits.length + 1];
                for (int i = 0; i < digitsNew.length; i++) {
                    if (i == 0) {
                        if (firstDigit == 9) digitsNew[0] = 1;
                        else digitsNew[i] = firstDigit + 1;
                    } else digitsNew[i] = 0;
                }
                return digitsNew;
            }
            return digits;
        }
        else {
            if (digits[0] == 9) return new int[]{1,0};
            else digits[0]+=1;
        }
        return digits;
    }
}
