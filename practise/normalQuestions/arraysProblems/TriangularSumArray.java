package practise.normalQuestions.arraysProblems;


public class TriangularSumArray {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(triangularSum(nums));
    }

    public static int triangularSum(int[] nums) {
        int i = 0, j = 1;
        if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2) {
            if (nums[i] + nums[j] >= 10)
                return nums[i] + nums[j] - 10;
            else return nums[i] + nums[j];
        } else {
            int[] newRow = new int[nums.length - 1];
            while (j <= newRow.length + 2) {
                int ans = nums[i] + nums[j];
                if (newRow.length == 1) {
                    if (nums[i] + nums[j] >= 10)
                        return nums[i] + nums[j] - 10;
                    else return nums[i] + nums[j];
                } else {
                    newRow[i] = ans;
                    if (ans >= 10)
                        newRow[i] -= 10;
                    else newRow[i] = ans;
                    i++;
                    j++;
                    if (j > newRow.length) {
                        nums = newRow;
                        newRow = new int[newRow.length - 1];
                        i = 0;
                        j = 1;
                    }
                }
            }
        }
        return 0;
    }
}
