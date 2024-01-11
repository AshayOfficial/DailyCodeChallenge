package practise.dailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class Que_07_09_23 {
    /*
    Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

    Example 1:
    Input: N = 6, X = 16
    Arr[] = {1, 4, 45, 6, 10, 8}
    Output: Yes
    Explanation: Arr[3] + Arr[4] = 6 + 10 = 16

    Example 2:
    Input: N = 5, X = 10
    Arr[] = {1, 2, 4, 3, 6}
    Output: Yes
    Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
    */

    public static void main(String[] args) {
        int target = 16;
        int[] array = {1, 4, 45, 6, 10, 8};
        if (twoSum(array, target))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberAndIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if (numberAndIndex.containsKey(ans))
                return true;
            numberAndIndex.put(nums[i], i);
        }
        return false;
    }
}
