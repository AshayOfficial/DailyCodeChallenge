package practise.normalQuestions.arraysProblems;

public class MonotonousArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{6, 6, 5, 7}));
    }

    public static boolean isMonotonic(int[] nums) {
        int i = 0, j = 1;
        while (j  <= nums.length) {
            if (j == nums.length) return true;
            if (nums[i] == nums[j]) {
                j++;
            }
            else break;
        }

        i = j - 1;
        while (j < nums.length) {
            if (nums[i] <= nums[j]) {
                if (nums[i] <= nums[j]) {
                    i++;
                    j++;
                } else return false;
            } else {
                if (nums[i] >= nums[j]) {
                    i++;
                    j++;
                } else return false;
            }
        }
        return true;
    }
}
