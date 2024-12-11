package practise.normalQuestions;

public class FindSecondOccurrenceOfMaximum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 5, 8, 6};
        int index = secondOccurrence(arr);
        System.out.println(arr[index]);
    }

    private static int secondOccurrence(int[] arr) {
        int max = 0;
        int max2 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) max = i;
            else if (arr[i] >= arr[max2]) max2 = i;

            if (max == max2) break;
        }
        return max2;
    }
}
