package practise.algos.search.binarySearch;

public class BinSearchAlgo {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 4, 66, 77, 89, 100};
        int target = 89;
        int left = 0;
        int right = sortedArray.length - 1;
        System.out.println("Searching Your Element in Array");
        int ans = binarySearchAlgorithm(sortedArray, target, left, right);
        System.out.println(ans == -1 ? "Element not found" : "Element present at index :: " + ans);
    }

    public static int binarySearchAlgorithm(int[] sortedArray, int target, int left, int right) {

        if (target == sortedArray[left])
            return left;
        if (target == sortedArray[right])
            return right;

        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (sortedArray[mid] == target)
            return mid;
        else if (sortedArray[mid] > target) {
            right = mid - 1;
            return binarySearchAlgorithm(sortedArray, target, left, right);
        } else {
            left = mid + 1;
            return binarySearchAlgorithm(sortedArray, target, left, right);
        }
    }
}
