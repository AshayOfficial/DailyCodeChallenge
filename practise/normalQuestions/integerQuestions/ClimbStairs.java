package practise.normalQuestions.integerQuestions;

public class ClimbStairs {
    /*
    ------------------------------------------------- PENDING ----------------------------------------------------------
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



    Example 1:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    Example 2:

    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
    */

    public static int climbStairs(int n) {
        int count = 1;
        int ways = 0;

        if (n == 1) return 1;

        if (n == 2) return 2;

        if (n == 3) return 3;

        for (int i = 0; i < n / 2; i++) {

        }
            return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb " + n + " steps :: " + climbStairs(n));
    }
}
