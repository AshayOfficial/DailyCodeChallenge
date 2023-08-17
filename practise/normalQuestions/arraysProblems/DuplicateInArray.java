package practise.normalQuestions.arraysProblems;

public class DuplicateInArray {
//    ---------------------------------------REMAINING---------------------------------------------
    public static boolean containsDuplicate(int[] nums) {
        int start = 1;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[start] == nums[i]) {
                return false;
            }
            else {
                start++;
                i = current;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
