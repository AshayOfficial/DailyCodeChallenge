package practise.dailyQuestionsBySir;

import java.util.Arrays;

public class Que_16_08_23 {
    /*
      Suppose we are given n red and n blue water jugs, all of different shapes and sizes. All red jugs hold different amounts of water, as do the blue ones. Moreover, there is a blue jug for every red jug that holds the same amount of water and vice versa. The task is to efficiently group the jugs into pairs of red and blue jugs that hold the same amount of water.
      Example:
      Input:
      red = {6, 3, 2, 8, 7};
      blue = {8, 6, 7, 2, 3};

      Output:

      Red jugs: [2, 3, 6, 7, 8]
      Blue jugs: [2, 3, 6, 7, 8]
    */

    public static void main(String[] args) {
        int[] redJugs = {6, 3, 2, 8, 7};
        int[] blueJugs = {8, 6, 7, 2, 3};

        //Using Quick Sort method
        pairOfJugs(redJugs, 0, redJugs.length - 1);
        System.out.println("Red Jugs:: " + Arrays.toString(redJugs));

        pairOfJugs(blueJugs, 0, blueJugs.length - 1);
        System.out.println("Blue Jugs:: " + Arrays.toString(blueJugs));

//        Using Arrays.sort()
//        pairOfJugs(redJugs, blueJugs);
    }

    //Quick Sort Method
    private static void pairOfJugs(int[] jugs, int start, int end) {
        if (start < end) {
            int partition = partition(jugs, start, end);
            pairOfJugs(jugs, start, partition - 1);
            pairOfJugs(jugs, partition + 1, end);
        }
    }

    private static int partition(int[] jugs, int start, int end) {
        int pivot = jugs[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (jugs[j] < pivot) {
                i++;
                swap(jugs, i, j);
            }
        }
        swap(jugs, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] jugs, int i, int j) {
        int temp = jugs[i];
        jugs[i] = jugs[j];
        jugs[j] = temp;
    }

//    private static void pairOfJugs(int[] redJugs, int[] blueJugs) {
//        int temp = 0;
//        Arrays.sort(redJugs);
//        Arrays.sort(redJugs);
//    }
}
