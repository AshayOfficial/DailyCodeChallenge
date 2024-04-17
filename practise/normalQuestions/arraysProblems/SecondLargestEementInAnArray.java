package practise.normalQuestions.arraysProblems;

public class SecondLargestEementInAnArray {
    public static void main(String[] args) {
        System.out.println(secondLargestElementBrute(new int[] {2,3,1,4,5,6,6,8,8,7,9}));
//        System.out.println(secondLargestElementOptimal(new int[] {2,3,1,4,5,6,6,8,8,7,9}));
    }

    private static int secondLargestElementOptimal(int[] arr) {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > slargest) slargest = arr[i];
        }
        return slargest;
    }

    private static int secondLargestElementBrute(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
        }

        int sLargest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > sLargest && j != largest) {
                sLargest = j;
            }
        }
        return sLargest;
    }
}
