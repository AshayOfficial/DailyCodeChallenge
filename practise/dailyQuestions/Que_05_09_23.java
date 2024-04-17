package practise.dailyQuestions;

public class Que_05_09_23 {
    /*
    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

    Example 1:
    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
    are being trapped.

    Example 2:
    Input: height = [4,2,0,3,2,5]
    Output: 9
    */
    public static void main(String[] args) {
        int[] height = {3,2,4, 2, 3};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        
        return 0;
    }
    private static int maxIndex(int[] height) {
        int max_index = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] >= height[max_index])
                max_index = i;
        }
        return max_index;
    }

    private static int waterTrapped(int waterTrap, int[] height, int i, int j) {
        if (j < i) {
            waterTrap += height[j] * (i - j - 1);
            for (int k = j + 1; k < i; k++) {
                waterTrap = waterTrap - height[k];
            }
        } else {
            waterTrap += height[j] * (j - i - 1);
            for (int k = i + 1; k < j; k++) {
                waterTrap = waterTrap - height[k];
            }
        }
        return waterTrap;
    }
}
