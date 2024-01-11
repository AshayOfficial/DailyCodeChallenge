package practise.dailyQuestions;

import java.util.Arrays;

public class Que_02_08_23 {
    public static void main(String[] args) {
        int target = 5;
        combinationsOfTargetNum(target);
    }

    public static void combinationsOfTargetNum(int target) {
        int[] combinationsArray = new int[target];
        Arrays.fill(combinationsArray, 0, target, 1);   // to insert predefined value in array
//        System.out.println(Arrays.toString(combinationsArray));    // [1,1,1,1,1]

        for (int i = combinationsArray.length - 1; i > 0; i--) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(combinationsArray, 0, i+1)));
            if (combinationsArray[i] - combinationsArray[i-1] < 2) {
                combinationsArray[i-1] += combinationsArray[i];
            }
            else {
                combinationsArray[i] -= 1;
                combinationsArray[i-1] += 1;
                i++;
            }
        }
            System.out.println(Arrays.toString(Arrays.copyOfRange(combinationsArray, 0, 1)));
    }
}
