package practise.algos.search.linearSearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
You are given an integer array of length n. You have to find MEX of ith element for all (1 < i < N).
MEX of the ith element is the minimum element greater than or equal to 0 which is not present in array till the ith
index.

Sample Input ---------- Sample Output
5
1 0 5 5 3    ---------- 0 2 2 2 2
*/
public class FindMEXOfArray {
    public static void main(String[] args) {
        int[] array = {1, 0, 5, 5, 3};
        System.out.println(Arrays.toString(mexOfArrayElements(array)));
    }

    private static int[] mexOfArrayElements(int[] array) {
        int mex = 0;
        Set<Integer> mexSet = new HashSet<>();
        int[] mexArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            mexSet.add(array[i]);
            if (array[i] != mex) {
                if (!mexSet.contains(mex)) {
                    mexArray[i] = mex;
                }
                else {

                }
            } else if (array[i] == mex) {
                mex += 1;
                mexArray[i] = mex;
            }
        }
        return null;
    }
}
