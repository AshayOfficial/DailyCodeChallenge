package practise.dailyQuestions;

/*
Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest
element in the given array. It is given that all array elements are distinct.
Note :-  l and r denotes the starting and ending index of the array.

Example 1:
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation : 3rd smallest element in the given array is 7.

Example 2:
Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation : 4th smallest element in the given array is 15.
*/
public class Que_12_09_23 {
    public static void main(String[] args) {
        int k = 4;
        int[] arr = {7, 10, 4, 20, 15};
        mergeSort(arr, arr.length);
        System.out.print(arr[k - 1]);
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
