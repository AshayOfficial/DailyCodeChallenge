package practise.dailyQuestionsBySir;

import java.util.Arrays;

public class Que_07_08_23 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        int k = 2;
        int[] arrayCopy = new int[k];
        int start = 0;
        possibleCombinationsOfArray(array, arrayCopy, start, k);
    }

    private static void possibleCombinationsOfArray(int[] integerArray, int[] integerArrayCopy, int start, int k) {
        if (start == 0) {
            integerArray = Arrays.stream(integerArray).sorted().distinct().toArray();
        }

        if (k == 0) {
            System.out.println(Arrays.toString(integerArrayCopy));
        } else {

            for (int i = 0; i < integerArray.length; i++) {
                integerArrayCopy[start] = integerArray[i];
                if (start > 0 && integerArrayCopy[start] > integerArrayCopy[start - 1]) {
                    return;
                }

                possibleCombinationsOfArray(integerArray, integerArrayCopy, start + 1, k - 1);
            }
        }
    }
}
