package practise.dailyQuestions;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is
missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the
range since it does not appear in nums.
*/
public class Que_17_01_24 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int x = (nums.length * (nums.length + 1)) / 2;
        for (int num : nums) {
            x -= num;
        }
        return x;
    }
}
