package practise.normalQuestions.arraysProblems;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumLeetCode {
    public static List<List<Integer>> threeSum(int[] nums){
        int first = 0;
        int second = 1;
        if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0)
                return List.of(new ArrayList<>(List.of(nums[0], nums[1], nums[2])));
            else return List.of();
        }
        List<List<Integer>> tripletList = new ArrayList<>();
        while (second < nums.length) {
            int result = -(nums[first] + nums[second]);
            for (int third = 0; third < nums.length; third++) {
                if (third != first && third !=second) {
                    if (nums[third] == result) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[first]);
                        triplet.add(nums[second]);
                        triplet.add(nums[third]);
                        List<Integer> tripletFinal = triplet.stream().sorted().toList();
                        if (!tripletList.contains(tripletFinal))
                            tripletList.add(tripletFinal);
                    }
                }
            }
            first++;
            second++;
        }
        return tripletList;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4}));
    }
}
