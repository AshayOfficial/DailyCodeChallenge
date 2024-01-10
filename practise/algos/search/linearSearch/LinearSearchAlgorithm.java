package practise.algos.search.linearSearch;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {11, 2, 35, 11, 54, 11, 0};
        int target = 11;
//        System.out.println("target found :: " + linearSearch(array, target));
//        System.out.println(lastOccurrenceLinearSearch(array, target));
//        System.out.println(allOccurencesLinerSearch(array, target));
    }

    private static Boolean linearSearch(int[] array, int target) {
        for (int num : array) {
            if (num == target)
                return true;
        }
        return false;
    }

    private static int lastOccurrenceLinearSearch(int[] array, int target) {
        for (int num = array.length - 1; num >= 0; num--) {
            if (array[num] == target)
                return num;
        }
        return -1;
    }

    private static List<Integer> allOccurencesLinerSearch(int[] array, int target) {
        List<Integer> indexList = new ArrayList<>();
        for (int num = 0; num < array.length; num++) {
            if (array[num] == target)
                indexList.add(num);
        }
        return indexList;
    }
}
