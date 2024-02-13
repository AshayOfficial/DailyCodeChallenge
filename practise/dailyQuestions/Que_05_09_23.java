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
        int[] height = {4, 2, 3};
        trap(height);
    }

    private static int trap(int[] height) {
        int i = 0;
        int j = 1;
        int waterTrap = 0;

        // maximum in array
        int max = maxValueCalculator(height, i);

        // calculating water trapped till max value of array
        while (j < height.length) {
            if (height[i] == max) break;
            if (height[i] > height[j]) j++;
            else if (height[j] >= height[i]) {
                waterTrap = waterTrapCalculator(waterTrap, height, i, j);
                i = j;
                j = j + 1;
            }
        }

        // calculating max after i reaches max value
        if (i < height.length - 1) {
            max = maxValueCalculator(height, i);

            // calculating water trapped after max height
            while (j < height.length) {
                if (height[j] != max) {
                    j++;
                } else if (height[j] == max) {
                    // {0,1,0,2,1,0,1,3,0,2,1,2,1}
                    waterTrap = waterTrapCalculator(waterTrap, height, j, i);
                    i = j;
                    j = j + 1;
                } else if (height[i] > height[j]) j++;
                else if (height[j] >= height[i]) {
                    waterTrap = waterTrapCalculator(waterTrap, height, j, i);
                    i = j;
                    j = j + 1;
                }
            }
        }
        return waterTrap;
    }

    private static int waterTrapCalculator(int waterTrap, int[] height, int j, int i) {
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

    private static int maxValueCalculator(int[] height, int i) {
        int max = Integer.MIN_VALUE;
        if (i == 0) {
            for (int value : height) {
                if (value > max) max = value;
            }
        } else {
            for (int l = i + 1; l < height.length; l++) {
                if (height[l] > max) max = height[l];
            }
        }
        return max;
    }
}
