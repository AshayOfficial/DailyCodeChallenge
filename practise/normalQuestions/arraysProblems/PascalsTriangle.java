package practise.normalQuestions.arraysProblems;

import java.util.ArrayList;
import java.util.List;

/*
// ===================== Pascal Triangle =====================
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// =================== Pascal Triangle 2 ==========================
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]
*/
public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 6, rowIndex = 3;
        System.out.println(pascalTriangle(numRows));
        System.out.println(pascalTriangle2(rowIndex));
    }

    // ===================== Pascal Triangle =====================
    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();
        int prevRowIndex = 0, i = 0, col = 1;
        List<Integer> pascalRow = new ArrayList<>();
        while (i < numRows) {
            if (mainList.size() < 2) {
                if (mainList.size() == 0) {
                    pascalRow.add(1);
                    mainList.add(pascalRow);
                    i++;
                    pascalRow = new ArrayList<>();
                } else {
                    pascalRow.add(1);
                    pascalRow.add(1);
                    mainList.add(pascalRow);
                    i++;
                    pascalRow = new ArrayList<>();
                }
            } else {
                if (pascalRow.size() == 0)
                    pascalRow.add(1);
                else {
                    List<Integer> prevRow = mainList.get(i - 1);
                    pascalRow.add(col, prevRow.get(prevRowIndex) + prevRow.get(prevRowIndex + 1));
                    col++;
                    prevRowIndex++;
                    if (col == i) {
                        pascalRow.add(1);
                        i++;
                        mainList.add(pascalRow);
                        col = 1;
                        prevRowIndex = 0;
                        pascalRow = new ArrayList<>();
                    }
                }
            }
        }
        return mainList;
    }

    // =================== Pascal Triangle 2 ==========================
    public static List<Integer> pascalTriangle2(int rowIndex) {
        int prevRowIndex = 0, i = 0, col = 1;
        List<Integer> pascalRow = new ArrayList<>();
        List<Integer> prevRowSave = null;

        while (i <= rowIndex) {
            if (i == 0) {
                pascalRow.add(1);
                prevRowSave = pascalRow;
                pascalRow = new ArrayList<>();
                i++;
            } else if (i > 0) {
                if (pascalRow.size() == 0) {
                    pascalRow.add(1);
                }
                else if (pascalRow.size() == i) {
                    pascalRow.add(1);
                    prevRowSave = pascalRow;
                    i++;
                    pascalRow = new ArrayList<>();
                }
                else {
                    pascalRow.add(prevRowSave.get(prevRowIndex) + prevRowSave.get(prevRowIndex + 1));
                    col++;
                    prevRowIndex++;
                    if (col == i) {
                        pascalRow.add(1);
                        i++;
                        prevRowSave = pascalRow;
                        pascalRow = new ArrayList<>();
                        col = 1;
                        prevRowIndex = 0;
                    }
                }
            }
        }
        return prevRowSave;
    }
}
