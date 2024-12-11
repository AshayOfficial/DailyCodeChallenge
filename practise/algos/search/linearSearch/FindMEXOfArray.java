package practise.algos.search.linearSearch;

import java.util.Arrays;

/*
You are given an integer array of length n. You have to find MEX of ith element for all (1 < i < N).
MEX of the ith element is the minimum element greater than or equal to 0 which is not present in array till the ith
index.

Sample Input ---------- Sample Output
5
1 0 5 5 3    ---------- 0 2 2 2 2
5 3 2 9 8    ---------- 0 0 0 0 0
1 2 3 4 5    ---------- 0 2 3 4 5
0 1 2 3 4    ---------- 1 2 3 4 5

Constraints :
array length n -> 1 < n < 2 * 10^5
arr[i] -> 0 < n < 2 * 10^5
*/
public class FindMEXOfArray {
    public static void main(String[] args) {
        int[] array = {1, 0, 5, 5,  3};
        System.out.println(Arrays.toString(mexOfArrayElements(array)));
    }

    private static int[] mexOfArrayElements(int[] array) {
        int mex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < mex) {

                }
            }
        }
        return null;
    }
}
