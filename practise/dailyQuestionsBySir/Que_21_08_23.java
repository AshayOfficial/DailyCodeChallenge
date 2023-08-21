package practise.dailyQuestionsBySir;

public class Que_21_08_23 {
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
