package practise.dailyQuestionsBySir;

import java.util.Arrays;

public class Que_06_09_23 {
    public static void main(String[] args) {
        int[] nums = {3,0,1,4,5,2,7};
        System.out.println(missingNumberInArray(nums));
    }

    private static int missingNumberInArray(int[] nums) {
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        while (count <= n) {
            if (i > nums.length - 1 || nums[i] != count)
                return count;
            count++;
            i++;
        }
        return -1;
    }
}
