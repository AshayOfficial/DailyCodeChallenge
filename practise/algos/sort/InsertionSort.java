package practise.algos.sort;

import practise.algos.utils.UtilityMethods;

import java.util.Arrays;
import java.util.stream.Stream;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{12, 11, 13, 5, 6})));
    }

    private static int[] insertionSort(int[] arr) {
        int i = 0;
        int j = i + 1;
        while(j < arr.length) {
            int key = arr[i];
            if (i == 0) {
                if (key < arr[j]) {
                    UtilityMethods.swap(arr, arr[j], key);
                    j++;
                }
            }
            else if (i > 0 && i < arr.length - 1){
//                if (key)
            }
        }
        return new int[0];
    }
}
