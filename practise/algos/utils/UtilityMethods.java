package practise.algos.utils;

public class UtilityMethods {
    public static void swap(int[] arr, int first,int second) {
        arr[first] = arr[first] + arr[second];
        arr[second] = arr[first] - arr[second];
        arr[first] = arr[first] - arr[second];
    }
}
