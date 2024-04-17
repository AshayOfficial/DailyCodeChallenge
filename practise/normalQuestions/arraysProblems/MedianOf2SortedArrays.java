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
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                merge[k] = nums2[j];
                j++;
            } else {
                merge[k] = nums1[i];
                i++;
            }
            k++;
        }
        if (j == nums2.length) {
            while (i < nums1.length) {
                merge[k] = nums1[i];
                i++;
                k++;
            }
        } else {
            while (j < nums2.length) {
                merge[k] = nums2[j];
                k++;
                j++;
            }
        }
        System.out.println(Arrays.toString(merge));
        int ele = merge.length / 2;
        return merge.length % 2 != 0 ? merge[ele] : (merge[ele] + merge[ele - 1]) / 2.0;
    }
}
