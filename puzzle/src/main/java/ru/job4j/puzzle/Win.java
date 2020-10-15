package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] != 1 && board[j][i] != 1) {
                        rsl = false;
                    }
                }
            }
        }
        return rsl;
    }
}

