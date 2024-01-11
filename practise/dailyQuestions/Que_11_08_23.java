package practise.dailyQuestions;

import java.util.Arrays;

public class Que_11_08_23 {
    /*
    Given a non-negative integer n, print the first n rows of Pascal’s triangle.
    Each number in Pascal’s triangle is constructed by adding the two numbers diagonally above, where blank entries being interpreted as 0. For instance, the first eight rows of Pascal’s triangle are depicted in the diagram below.


    For Example:
    Input: n = 3
    Output: [[1], [1, 1], [1, 2, 1]]

    Input: n = 5
    Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    */

    public static void main(String[] args) {
        int number = 5;
        System.out.println(Arrays.deepToString(printPascalTraingleNoInArray(number)));
    }

    private static int[][] printPascalTraingleNoInArray(int number) {
        int[][] pascalTriangleNo = new int[number][];
        for (int j = 0; j < number; j++) {
            int[] pascalTriangleRowArray = new int[j + 1];
            pascalTriangleRowArray[0] = 1;
            if (j != 0 && j < pascalTriangleRowArray.length) {
                if (j == 1) {
                    pascalTriangleRowArray[pascalTriangleRowArray.length - 1] = 1;
                    pascalTriangleNo[j] = pascalTriangleRowArray;
                    continue;
                }
                int ptr1 = 0;
                int ptr2 = ptr1 + 1;
                for (int k = 0; k < pascalTriangleRowArray.length - 1; k++) {
                    pascalTriangleRowArray[k + 1] = pascalTriangleNo[j - 1][ptr1] + pascalTriangleNo[j - 1][ptr2];
                    if (ptr2 < pascalTriangleNo[j - 1].length - 1) {
                        ptr1++;
                        ptr2++;
                    }
                }
            }
            pascalTriangleRowArray[pascalTriangleRowArray.length - 1] = 1;
            pascalTriangleNo[j] = pascalTriangleRowArray;
        }
        return pascalTriangleNo;
    }
}
