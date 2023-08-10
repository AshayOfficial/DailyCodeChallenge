package practise.dailyQuestionsBySir;

import java.util.Arrays;

public class Que_04_08_23 {

//    Given an integer array, determine whether it can be divided into pairs such that the sum of elements in each pair is divisible by a given positive integer k.
//    For Example
//    Input:
//    arr[] = { 3, 1, 2, 6, 9, 4 }
//    k = 5
//
//    Output: Pairs can be formed
//
//    Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where the sum of elements in each pair is divisible by 5.

    public static void main(String[] args) {
        Integer[] array = {3, 1, 2, 6, 9, 4};
        int target = 6;
        if (pairCanBeFormedOrNot(array, target))
            System.out.println("Pairs can be formed");
        else
            System.out.println("Pairs cannot be formed");
    }

    static Boolean pairCanBeFormedOrNot(Integer[] array, int target) {
        int first = 0;
        int second = 1;
        Integer[] arrCopy = new Integer[array.length];

        System.arraycopy(array, 0, arrCopy, 0, arrCopy.length);
        System.out.println(Arrays.toString(arrCopy));
//        {3, 1, 2, 6, 9, 4}
        for (int i = 0; i <= array.length; i++) {
            if (second <= array.length - 1) {
                if ((array[first] + array[second]) % target == 0) {
                    arrCopy[first] = null;
                    arrCopy[second] = null;
                }
                second++;
            }
            else {
                first++;
                second = first + 1;
                i = first;
            }
        }

        for (Integer integer : arrCopy) {
            if (integer != null)
                return false;
        }
        return true;
    }
}
