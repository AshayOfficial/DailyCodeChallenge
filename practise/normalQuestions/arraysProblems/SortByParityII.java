package practise.normalQuestions.arraysProblems;

import java.util.Arrays;

public class SortByParityII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4, 2, 5, 7, 8, 10, 9, 11})));
    }

    // TC : O(N^2)
   /* public static int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] % 2 == 0)  {
                        swap(nums, i, k);
                        i++;
                        break;
                    }
                }
            }
            else if (i % 2 != 0 && nums[i] % 2 == 0) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] % 2 != 0)  {
                        swap(nums, i, k);
                        i++;
                        break;
                    }
                }
            }
            else i++;
        }
        return nums;
    }*/

    private static void swap(int[] nums, int firstIndex, int secondIndex) {
        nums[firstIndex] = nums[firstIndex] + nums[secondIndex];
        nums[secondIndex] = nums[firstIndex] - nums[secondIndex];
        nums[firstIndex] = nums[firstIndex] - nums[secondIndex];
    }

    // another approach
    private static int[] sortArrayByParityII(int[] nums) {
        int k = nums.length - 1, j = 0;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                newArray[k] = nums[i];
                k--;
            }
            else  {
                newArray[j] = nums[i];
                j++;
            }
        }

        k = nums.length - 1;
        for (int i = 0; i < newArray.length / 2; i++) {
            if (i % 2 == 0 && newArray[i] % 2 != 0) {
                swap(newArray, i, k - 1);
                k -= 2;
            }
            else if (i % 2 != 0 && newArray[i] % 2 == 0) {
                swap(newArray, i, k - 1);
                k -= 2;
            }
        }
        return newArray;
    }
}
