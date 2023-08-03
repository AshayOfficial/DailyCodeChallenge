import java.util.Arrays;

public class Que_03_08_23 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,10,4,5};
        int[] pos = {3,2,4,1,0,5};
        int[] arrayShuffling = arrayShuffling(nums, pos);
        System.out.println(Arrays.toString(arrayShuffling));
    }

    static int[] arrayShuffling(int[] nums, int[] pos) {
        if (nums.length == pos.length) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (pos[i] == j) {
                        ans[j] = nums[i];
                        break;
                    }
                }
            }
            return ans;
        }
        return null;
    }
}
