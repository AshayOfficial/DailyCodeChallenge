package practise.normalQuestions.patternProblems;

public class PatternQuestions {
    public static void main(String[] args) {
        rightAngledTriangleFromLeftHollow(5);
    }

    private static void rightAngledTriangleFromLeftHollow(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row == n) System.out.print("* ");
                else if (col == 1 || col == row) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void rightAngledTriangleFromRight(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = n - row + 1; col <= n; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void rightAngledTriangleFromLeft(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rectangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n * 2; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollowRectangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n + 1; col++) {
                if (row == 1 || row == n) System.out.print("* ");
                else if (col == 1 || col == 2 * n + 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
