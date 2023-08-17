package practise.dailyQuestionsBySir;

import java.util.Arrays;

public class Que_17_08_23 {
    /*
    Given an integer array having distinct elements, find the surpasser count for each element in it. In other words,
    for each array element, find the total number of elements to its right, which are greater than it.
    For example:
    Input:  { 4, 6, 3, 9, 7, 10 }

    Output: { 4, 3, 3, 1, 1, 0 }
    */
    public static void main(String[] args) {
        int[] array = {4, 6, 3, 4, 7, 10};
        System.out.println(Arrays.toString(surpasserCount(array)));
    }

    private static int[] surpasserCount(int[] array) {
        int i = 0;
        int j = i + 1;
        int count = 0;

        while (i < array.length) {
            if (j > array.length - 1) {
                array[i] = count;
                count = 0;
                i++;
                j = i + 1;
            }

            if (i == array.length - 1) {
                array[i] = 0;
                return array;
            }

            if (array[i] < array[j] && j <= array.length - 1) {
                count++;
                j++;
            } else if (array[i] >= array[j]) {
                j++;
            }
        }
        return array;
    }
}
