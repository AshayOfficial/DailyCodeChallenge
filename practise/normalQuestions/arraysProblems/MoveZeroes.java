package practise.normalQuestions.arraysProblems;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length && i < nums.length) {
            if (nums[i] == 0) {
                if ((nums[j] != 0) && i < j) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                }
                j++;
            }
            else i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
