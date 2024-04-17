package practise.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibNo(4));
    }

    private static int fibNo(int n) {
        if (n <= 1) return n;
        return fibNo(n - 1) + fibNo(n - 2);
    }
}
