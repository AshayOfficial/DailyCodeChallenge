package practise.normalQuestions.arraysProblems;

import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{8, 5, 9, 1, 10, 2, 6}));
    }

    private static int maxArea(int[] height) {
        int first = 0, last = height.length - 1, area = 0;
        while (first < last) {
            area = Math.max(area, Math.min(height[first], height[last]) * (last - first));
            if (height[first] < height[last]) first +=1;
            else last -= 1;
        }
        return area;
    }
}
