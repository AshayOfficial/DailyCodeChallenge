package practise.dailyQuestions;

public class Que_21_08_23 {
    /*
    Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If
    there are more than one such number, then output the one having maximum absolute value.

    Example 1:
    Input:
    N = 13 , M = 4
    Output:
    12
    Explanation:
    12 is the Closest Number to
    13 which is divisible by 4.

    Example 2:
    Input:
    N = -15 , M = 6
    Output:
    -18
    Explanation:
    -12 and -18 are both similarly close to
    -15 and divisible by 6. but -18 has
    the maximum absolute value.
    So, Output is -18
    */
    public static void main(String[] args) {
        int n = -15;
        int m = 31;
        closestDivisibleNo(n, m);
    }

    public static void closestDivisibleNo(int n, int m) {
        int quotient;

        if (n < 0 && m < 0) quotient = n / m;
        else if (n < 0)
            quotient = n * -1 / m;
        else quotient = n / m;

        int closestNumber1 = m * quotient;
        int closestNumber2 = m * (quotient + 1);

        if (n < 0 && m < 0) {
            closestNumber2 *= -1;
            closestNumber1 *= -1;
            System.out.println(closestNoIdentification(closestNumber1, closestNumber2, n * -1) * -1);
        } else if (n < 0)
            System.out.println(closestNoIdentification(closestNumber1, closestNumber2, n * -1) * -1);
        else
            System.out.println(closestNoIdentification(closestNumber1, closestNumber2, n));
    }

    private static int closestNoIdentification(int closestNo1, int closestNo2, int n) {
        if (n - closestNo1 == closestNo2 - n)
            return closestNo2;
        else if (n - closestNo1 < closestNo2 - n)
            return closestNo1;
        else if (n - closestNo1 > closestNo2 - n)
            return closestNo2;
        else return closestNo2;
    }
}
