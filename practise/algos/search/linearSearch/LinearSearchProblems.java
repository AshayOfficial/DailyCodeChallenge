package practise.algos.search.linearSearch;

public class LinearSearchProblems {
    public static void main(String[] args) {
//        int[] arr = {2, 0, 3, 9, 1, 7, 8, 9, 9, 2};
        int[][] arr2d = {
                {1, 2, 9, 9, 9},
                {9, 3, 2, 6, 2},
                {9, 5, 3, 7, 5},
        };
//        firstOccurrenceOfValue(arr, 9);
//        System.out.println("--------------------");
//
//        lastOccurrenceOfValue(arr, 9);
//        System.out.println("--------------------");
//
//        multipleOccurrenceOfValue(arr, 9);
//        System.out.println("--------------------");

//        findMax(arr);
//        System.out.println("--------------------");

//        findMin(arr);
//        System.out.println("--------------------");

//        linearSearchAt2dArrayFirstOcc(arr2d, 2);
//        System.out.println("--------------------");

//        linearSearchAt2dArrayLastOcc(arr2d, 2);
//        System.out.println("--------------------");

        maxSumSubarray(arr2d);
    }

    private static void maxSumSubarray(int[][] arr2d) {
        int maxSum = 0;
        int maxSumPrev = 0;
        int outerIndex = 0;
        for (int i = 0; i < arr2d.length; i++) {
            maxSum = 0;
            for (int j = 0; j < arr2d[i].length; j++) {
                maxSum = maxSum + arr2d[i][j];
            }

            if (maxSumPrev < maxSum) {
                maxSumPrev = maxSum;
                outerIndex = i;
            }
        }

        System.out.println("Max sum is : " + maxSumPrev + ", at position : " + outerIndex);
    }

    private static void linearSearchAt2dArrayFirstOcc(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    System.out.println("Element found at : " + i + ", " + j);
                }
            }
            if (found)
                break;
        }
    }

    private static void linearSearchAt2dArrayLastOcc(int[][] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean found = false;
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] == target) {
                    found = true;
                    System.out.println("Element found at : " + i + ", " + j);
                    break;
                }
            }
            if (found)
                break;
        }
    }

    private static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("min element of array is : " + min);
    }

    private static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("max element of array is : " + max);
    }

    private static void firstOccurrenceOfValue(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found first occ of element at position : " + i);
                break;
            }
        }
    }

    private static void lastOccurrenceOfValue(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                System.out.println("Found last occ of element at position : " + i);
                break;
            }
        }
    }

    private static void multipleOccurrenceOfValue(int[] arr, int target) {
        int[] occ = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                occ[j] = i;
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.println("Occurrence of element at pos : " + occ[i]);
        }
    }

}
