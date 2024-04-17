package practise.normalQuestions.arraysProblems;

import java.util.Arrays;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/
public class MedianOf2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {4, 5};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (j < nums2.length && i < nums1.length) {
            if (nums1[i] > nums2[j]) {
                merge[k] = nums2[j];
                k++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                merge[k] = nums1[i];
                k++;
                i++;
            }
            else {
                merge[k] = nums1[i];
                k++;
                i++;
            }
        }
        System.out.println(Arrays.toString(merge));
        return 0.00;
    }
}
