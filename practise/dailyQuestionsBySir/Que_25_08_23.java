package practise.dailyQuestionsBySir;

import java.util.Arrays;

public class Que_25_08_23 {
    public static void main(String[] args) {
        int[] array = {9, 3, 5, 2, 8, 6, 1, 3};
        System.out.println(Arrays.toString(segeregateArray(array)));
    }

    public static int[] segeregateArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            if (array[i] < 0)
                i++;
            else if (array[j] > 0)
                j--;
            else if (array[i] > 0 && array[j] < 0) {
                array[i] = array[i] + array[j];
                array[j] = array[i] - array[j];
                array[i] = array[i] - array[j];

                i++;
                j--;
            }
        }
            return array;
    }
}
