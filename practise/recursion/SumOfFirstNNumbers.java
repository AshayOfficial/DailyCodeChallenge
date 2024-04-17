package practise.recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
//        sumOfFirstParamRecursive(3, 0);
        System.out.println(sumOfNNummberFuncRecursive(10));
    }

    private static void sumOfFirstParamRecursive(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfFirstParamRecursive(n - 1, sum + n);
    }

    private static int sumOfNNummberFuncRecursive(int n) {
        if (n < 1) {
            return n;
        }
        return n + sumOfNNummberFuncRecursive(n - 1);
    }
}
