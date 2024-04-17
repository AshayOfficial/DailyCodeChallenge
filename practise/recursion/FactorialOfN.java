package practise.recursion;

public class FactorialOfN {
    public static void main(String[] args) {
//        System.out.println(factorialParamRec(5));
//        System.out.println(factorialWithoutRecursion(5));
        factorialFuncRec(5, 1);
    }

    private static int factorialParamRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialParamRec(n - 1);
    }

    private static void factorialFuncRec(int n, int fact) {
        if (n == 1) {
            System.out.println(fact);
            return;
        }
        factorialFuncRec(n - 1, fact * n);
    }

    private static int factorialWithoutRecursion(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
