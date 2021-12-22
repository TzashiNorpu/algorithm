package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_6_037Test {

    @Test
    void solveSudoku() {
        LeetCode_6_037 ins = new LeetCode_6_037();
        char[][] board1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        ins.solveSudoku(board1);
        for (int i = 0; i < board1.length; i++) {
            for (int j = 0; j < board1[0].length; j++) {
                System.out.print(board1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        char[][] board2 = {
                {'.', '.', '9', '7', '4', '8', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
                {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
                {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '2', '7', '5', '9', '.', '.'}
        };
        ins.solveSudoku(board2);
        for (int i = 0; i < board2.length; i++) {
            for (int j = 0; j < board2[0].length; j++) {
                System.out.print(board2[i][j] + "  ");
            }
            System.out.println();
        }
    }
}


     /*   {'5','1','9','7','4','8','6','3','2'},
        {'7','8','3','6','5','2','4','1','9'},
        {'4','2','6','1','3','9','8','7','5'},
        {'3','5','7','9','8','6','2','4','1'},
        {'2','6','4','3','1','7','5','9','8'},
        {'1','9','8','5','2','4','3','6','7'},
        {'9','7','5','8','6','3','1','2','4'},
        {'8','3','2','4','9','1','7','5','6'},
        {'6','4','1','2','7','5','9','8','3'},
        --------------------------------------
        3 1 9 7 4 8 6 5 2
        7 4 5 6 3 2 1 8 9
        6 2 3 1 5 9 8 7 4
        5 3 7 9 8 6 2 4 1
        2 6 4 3 1 7 5 9 8
        1 9 8 5 2 4 3 6 7
        9 7 1 8 6 3 4 2 5
        8 5 2 4 9 1 7 3 6
        4 8 6 2 7 5 9 1 3*/