package practise.normalQuestions.arraysProblems;

import java.util.Arrays;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
*/
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                i += 2;
                if ((j+2) > nums.length) j += 1;
                else j += 2;
            } else return nums[i];
        }
        return nums[i];
    }
}
