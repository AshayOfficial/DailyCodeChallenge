package practise.recursion;

public class RecursionBasicQue {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("---------Print name 5 times------------");
        printName5Times(count);
        System.out.println("---------Print 1 to n------------");
        print1ToN(count, 5);
        System.out.println("----------Print n t0 1-----------");
        printNTo1(5);
        System.out.println("----------Print 1 to n by backtracking-----------");
        print1ToNByBackTracking(5,5);
        System.out.println("----------Print n to 1 by backtracking-----------");
        printNTo1ByBackTracking(1,5);
    }

    // print name 5 times
    private static void printName5Times(int count) {
        if (count == 5) {
            System.out.println("Author " + count);
            return;
        }
        System.out.println("Author " + count);
        count++;
        printName5Times(count);
    }

    // print linearly from 1 to 10
    private static void print1ToN(int val, int n) {
        if (val == n + 1) return;
        System.out.println(val);
        print1ToN(++val, n);
    }

    private static void printNTo1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNTo1(--n);
    }

    private static void print1ToNByBackTracking(int n, int count) {
        if (n < 1) return;
        print1ToNByBackTracking(n-1, count);
        System.out.println(n);
    }

    private static void printNTo1ByBackTracking(int n, int count) {
        if (n > count) return;
        printNTo1ByBackTracking(n+1, count);
        System.out.println(n);
    }
}
