package practise.algos.sort;

import java.util.Arrays;

/**
* Select first index as min_index as this pos will hold the min value. Find min_ele from rest of the array and  swap
 * with the min_index value.
* i = 0, j = i + 1, min_index = i
* arr=[64,25,12,12,22,11]
* Time Complexity -> avg: O(N^2), worst: O(N^2), best: O(N^2)
* Space Complexity -> Aux space: O(1)
 * */
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[] {64,25,12,12,22,11})));
    }

    // By finding min ele index and swapping
    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
