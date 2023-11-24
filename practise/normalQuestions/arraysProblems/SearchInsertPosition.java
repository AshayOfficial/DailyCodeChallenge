package practise.normalQuestions.arraysProblems;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
*/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int target = 2;
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length > 1) {
            return findTarget(nums, target, start, end);
        } else if (target == nums[0] || target < nums[0])
            return 0;
        else return 1;
    }

    private static int findTarget(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (mid <= end && mid < nums.length) {
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) return findTarget(nums, target, mid + 1, end);
            else if (target < nums[mid]) return findTarget(nums, target, start, mid - 1);
        }
        else return findPosition(nums, target, 0, nums.length - 1);
        return 0;
    }

    private static int findPosition(int[] nums, int target, int start, int end) {
        int mid = (start + end) /2;
        if (target < nums[start]) return start;
        else if (target > nums[end]) return end + 1;
        else if (target < nums[mid]) return findPosition(nums, target, start, mid - 1);
        else if (target > nums[mid]) return findPosition(nums, target, mid + 1, end);
        return 0;
    }
}

