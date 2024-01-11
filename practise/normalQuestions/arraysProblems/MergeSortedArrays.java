package practise.normalQuestions.arraysProblems;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};/*{4,0,0,0,0,0}*/
        int m = 3;
        int[] nums2 = {1,2,3};/*{1,2,3,5,6}*/
        int n = 3;
        merge(nums1, m, nums2, n);
    }
    // change required for sorting
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int i = 0, j = 0;
        while(i <= nums1.length && j < nums2.length) {
            if (nums1[i] != 0) {
                if (nums1[i] <= nums2[j]) i++;
                else if (nums1[i] > nums2[j]) {
                    swap(nums1, nums2, i, j);
                    i++;
                }
            } else {
                nums1[i] = nums2[j];
                nums2[j] = 0;
                j++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void swap(int[]nums1, int[] nums2, int i, int j) {
        nums1[i] = nums1[i] + nums2[j];
        nums2[j] = nums1[i] - nums2[j];
        nums1[i] = nums1[i] - nums2[j];
    }
}
