package practise.dailyQuestions;

import java.util.Arrays;

/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]
*/
public class Que_19_12_23 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(kMostFreqNo(nums, k)));
    }

    private static int[] kMostFreqNo(int[] nums, int k) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int count = 1;
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i = j;
                j = i+1;
                count = 1;
            } else {
                count++;
                j++;
            }
        }
        return nums;
    }
}
