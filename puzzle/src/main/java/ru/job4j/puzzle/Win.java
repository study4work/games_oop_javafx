package ru.job4j.puzzle;

public class Win {
    public static boolean horizontalCheck(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean verticalCheck(int[][] board, int colum) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][colum] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                rsl = verticalCheck(board, i) || horizontalCheck(board, i);
                break;
            }
        }

        return rsl;
    }
}


