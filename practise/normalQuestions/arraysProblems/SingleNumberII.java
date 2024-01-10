package practise.normalQuestions.arraysProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,3,2]
Output: 3
*/
public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {4,2,2,3,3,3,2,1,1,1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        List<Integer> singleNumberList = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = 1, k = 2;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != nums[j]) {
                singleNumberList.add(nums[i]);
            }
            else i+=3; j+=3; k+=3;
        }
        return nums[i];
    }
}
