package practise.recursion;

import java.util.Arrays;

import static practise.algos.utils.UtilityMethods.swap;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,0,5,9,5,7, 76,99,34};
//        reverseArray(arr,0, arr.length - 1);
        reverseArray1Var(arr, 0, arr.length - 1);
    }

    private static void reverseArray(int[] arr, int i, int j) {
        if (i >= j) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr, i, j);
        reverseArray(arr, i+1, j-1);
    }

    // one var reverse
    private static void reverseArray1Var(int[] arr, int i, int j) {
        if (i >= arr.length / 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr, i, j);
        reverseArray1Var(arr, i+1, arr.length - i - 2);
    }
}
