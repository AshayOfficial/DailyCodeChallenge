package practise.normalQuestions.arraysProblems;

public class MajorityElement {
    /*
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
    always exists in the array.

    Example 1:
    Input: nums = [3,2,3]
    Output: 3

    Example 2:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
    */
    public static void main(String[] args) {
        int[] array = {2,2,3,3,3,3,2};
        System.out.println(majorityElement(array));
    }

    private static int majorityElement(int[] nums) {
        int i = 0;
        int j = i + 1;
        int count = 1;

        if(nums.length == 1) {
            return 1;
        }

        while (i < nums.length) {
            if (j == nums.length) {
                i++;
                j = i + 1;
                count = 1;
            }

            if (i > nums.length - 1) {
                return 0;
            }

            if (nums[i] == nums[j] && nums[j] > Integer.MIN_VALUE && nums[i] > Integer.MIN_VALUE) {
                count++;
                if (count > nums.length / 2) {
                    return nums[j];
                }
                nums[j] = Integer.MIN_VALUE;
            }
            j++;
        }
        return 0;
    }
}
