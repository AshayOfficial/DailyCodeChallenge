package practise.normalQuestions.arraysProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/
public class IntersectionOf2Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] {1,2,2,1}, new int[] {2,2})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
            }
            j++;

            if (j == nums2.length - 1) {
                if (nums1[i] == nums2[j]) intersection.add(nums1[i]);
                i++;
                j = 0;
            }
        }
        i = 0;
        int[] ans = new int[intersection.size()];
        for (Integer integer : intersection) {
            ans[i] = integer;
            i++;
        }
        return ans;
    }
}
