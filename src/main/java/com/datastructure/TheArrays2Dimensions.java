package com.datastructure;

import java.util.Arrays;

public class TheArrays2Dimensions {
    public static void main(String[] args) {
        char[][] board = new char[3][3]; // 크기 고정

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-'; // char에는 홑따옴표를 쓴다
//                board[i][j] = "-";
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        char[][] boardTwo = new char[][]{
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
        };

        System.out.println("board = " + Arrays.deepToString(board)); // 2차원 배열을 조회하는 유틸 함수
        System.out.println("boardTwo = " + Arrays.deepToString(boardTwo)); // 2차원 배열을 조회하는 유틸 함수
    }
}
