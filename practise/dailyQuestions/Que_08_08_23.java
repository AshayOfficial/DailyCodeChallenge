package practise.dailyQuestions;

import java.util.Arrays;

public class Que_08_08_23 {
    public static void main(String[] args) {
        int[] array = {4, 6, 1, 7, 5, 9, 2};
        System.out.println(trimmedArray(array));
    }

    public static int trimmedArray(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                if (i >= j)
                    break;
                else {
                    int[] trimmedArray = Arrays.copyOfRange(array, i, j + 1);
                    for (int value : trimmedArray) {
                        if (value < min) {
                            min = value;
                        }
                    }

                    for (int value : trimmedArray) {
                        if (value > max) {
                            max = value;
                        }
                    }
                    if (2 * min > max && length < j - i) {
                        length = j - i;
                    }
                }
            }
        }
        return array.length-1-length;
    }
}
