package practise.algos.sort;

import java.util.Arrays;

/*
Time COmplexity :   Best    ----> O(n)
                    Worst   ----> O(n^2)
Space Complexity : O(1)*/
public class BubblleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {9, 2, 4, 2, 6, 0, 10, 55, 42, -1};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int i = 0, j = 0;
        while (i <= arr.length - 1) {
            if (arr[j] <= arr[j + 1]) j++;
            else if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                j++;
            }
            if (j == arr.length - 1) {
                i++;
                j = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
