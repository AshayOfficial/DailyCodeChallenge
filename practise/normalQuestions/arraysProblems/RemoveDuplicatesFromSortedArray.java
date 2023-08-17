package practise.normalQuestions.arraysProblems;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] sortedArrayContDups = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDupsFromArray(sortedArrayContDups));
        System.out.println(Arrays.toString(sortedArrayContDups));
    }

    static int removeDupsFromArray(int[] nums) {
        // Method 1
        /*
        Set<Integer> integerSet = new TreeSet<>();
        for (int sortedArrayContDup : nums) {
            integerSet.add(sortedArrayContDup);
        }

        int i = 0;
        for (Integer integer : integerSet) {
            nums[i++] = integer;
        }

        System.out.print(integerSet.size() + ", ");
        System.out.println(Arrays.toString(integerSet.toArray()));*/

        //Method 2
        int i = 0;
        int j = 1;
        int count = 1;
        int k = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] == nums[j])
                j++;
            else if (nums[i] != nums[j]) {
                nums[k++] = nums[j];
                i = j;
                j++;
                count += 1;
            }
        }
        return count;
    }
}
