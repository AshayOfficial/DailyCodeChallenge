package practise.normalQuestions.arraysProblems;

public class DuplicateInArray {
    //    ---------------------------------------WORKING BUT NOT WITH LENGTH 10000 NEED TO OPTIMIZE---------------------------------------------
    public static boolean containsDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length) {
            if (i == nums.length - 1)
                return false;
            if (nums[i] == nums[j])
                return true;
            else if (j == nums.length - 1) {
                i++;
                j = i + 1;
            } else if (nums[i] != nums[j]) {
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 14, 18, 22, 22};
        System.out.println(containsDuplicate(nums));
    }
}
