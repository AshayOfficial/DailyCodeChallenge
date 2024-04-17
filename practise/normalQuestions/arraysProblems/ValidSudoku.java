package practise.normalQuestions.arraysProblems;

import java.util.HashSet;
import java.util.Set;

/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
- Each row must contain the digits 1-9 without repetition.
- Each column must contain the digits 1-9 without repetition.
- Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
*/
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'}
                , {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}
                , {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}
                , {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}
                , {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}
                , {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}
                , {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'}
                , {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}
                , {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        int i = 0, j = 0;
        Set<Character> validator = new HashSet<>();
        boolean valid;
        valid = rowValidator(i, j, board, new HashSet<>(9));
        valid = colValidator(i, j, board, new HashSet<>(9));
        valid = gridValidator(i, j, board, new HashSet<>(9));
        return valid;
    }

    private static boolean gridValidator(int i, int j, char[][] board, HashSet<Object> validator) {

        return true;
    }

    private static boolean colValidator(int i, int j, char[][] board, HashSet<Object> validator) {
        boolean valid;
        // validating column
        while (j < board.length) {
            if (i <= board[j].length) {
                if (i == board[j].length) {
                    j++;
                    i = 0;
                    validator.clear();
                    continue;
                }
                if (board[i][j] != '.') {
                    valid = validator.add(board[i][j]);
                    if (!valid) return false;
                }
                i++;
            }
        }
        return true;
    }

    static boolean rowValidator(int i, int j, char[][] board, Set<Character> validator) {
        boolean valid;
        while (i < board.length) {
            // validating row
            if (j <= board[i].length) {
                if (j == board[i].length) {
                    i++;
                    j = 0;
                    validator.clear();
                    continue;
                }
                if (board[i][j] != '.') {
                    valid = validator.add(board[i][j]);
                    if (!valid) return false;
                }
                j++;
            }
        }
        return true;
    }
}
