package practise.dailyQuestionsBySir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que310723 {

//    Given an unsorted integer array containing many duplicate elements, rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
//    For example:
//    Input:  { 1, 2, 3, 1, 2, 1 }
//    Output: { 1, 1, 1, 2, 2, 3 }

    public static void reArrangeOnFirstOccurance(int[] initArray){
        int[] tempArray = new int[initArray.length];
        List<Integer> list = new ArrayList<>();
        int k=0;
        for (int element : initArray) {
            for (int j = 0; j < initArray.length; j++) {
                if (element == initArray[j] && !list.contains(initArray[j])) {
                    tempArray[k] = initArray[j];
                    k++;
                }
            }
            list.add(element);
        }
        System.out.println(Arrays.toString(tempArray));
    }

    public static void main(String[] args) {
        int[] initArray = { 1, 2, 3, 1, 2, 1 };
        Que310723.reArrangeOnFirstOccurance(initArray);
    }
}
