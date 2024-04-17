package practise.normalQuestions.arraysProblems;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4}));
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        int count = 1;
        int dupCount = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j] && count < 2) {
                j++;
                count++;
            } else if (nums[i] == nums[j] && count >= 2) {
                nums[j] = Integer.MIN_VALUE;
                j++;
                dupCount++;
            } else if (nums[i] != nums[j]) {
                count = 1;
                i = j;
                j++;
            }
        }
        i = 0;
        while (i < nums.length) {
            if (nums[i] != Integer.MIN_VALUE) i++;
            else if (nums[i] == Integer.MIN_VALUE) {
                break;
            }
        }
        count = 0;
        j = i + 1;
        while (j < nums.length) {
            if (nums[j] != Integer.MIN_VALUE) {
                swap(nums, i, j);
                j++;
                i++;
            } else j++;
        }
        return nums.length - dupCount;
    }

    private static void swap(int[] nums, int first, int second) {
        nums[first] = nums[first] + nums[second];
        nums[second] = nums[first] - nums[second];
        nums[first] = nums[first] - nums[second];
    }
}
