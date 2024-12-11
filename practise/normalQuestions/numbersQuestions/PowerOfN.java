package practise.normalQuestions.numbersQuestions;

public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(myPow(2, -2147483648));
    }

    public static double myPow(double x, int n) {
        double ans = 0.0;
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                n = (n + 1) * (-1);
                ans = findPower(x, n);
                return 1 / (ans * x);
            }
            return 1 / findPower(x, -n);
        }
        else
            return findPower(x,n);
    }

    private static double findPower(double x, int n) {
        double ans = 1.00000d;
        for (int i = 0; i < n; i++) {
            ans = ans * x;
        }
        return ans;
    }

    public static double myPow2(double x, int n) {
        if (n == 0) {
            return 1.00000;
        } else if (n < 0) {
            return 1 / power(x, -n);
        } else return power(x, n);
    }

    private static double power(double x, int n) {
        double ans = 1.0;
        if (n == 1) return x;
        else if (n > n/2) return ans;
        else {
            ans = power(x, n - 1);
        }
        return ans * x;
    }
}
