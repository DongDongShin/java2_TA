package w1.tictactoe;

import java.util.Scanner;

/**
 * 오목과 비슷한 삼목 게임.
 * 사람이 놓는 돌 X
 * 컴퓨터가 놓는 돌 O
 * 사람이 먼저 돌을 놓는다.
 */

public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = new char[3][3];  // 3x3 바둑판.
        int x, y;    // 바둑판의 좌표.

        Scanner scan = new Scanner(System.in);

        // 바둑판을 초기화한다. (아홉 개의 방에 공백문자를 채운다.)
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
        do {
            // 바둑판을 화면에 그린다.
            for (int i = 0; i < 3; i++) {
                System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
                if (i != 2)
                    System.out.println("---|---|---");
            }

            // 사람의 입력을 받는다.
            System.out.print("0 이상 3 미만 정수 두 개 입력: ");
            x = scan.nextInt();
            y = scan.nextInt();

            if (board[x][y] != ' ') {
                System.out.println("잘못된 위치입니다. ");
                continue; // 비어 있지 않은 곳에 사람이 돌을 놓으려고 하면 while 반복문의 첫 줄로 간다.
            } else
                board[x][y] = 'X';

            // 컴퓨터가 돌을 놓는다.
            // (0, 0)부터 (0, 1), (0, 2), (1, 0), (1, 1), ... 순서로 빈곳을 찾는다.
            // 빈 곳을 찾으면 반복문을 빠져나온다.
            //순서대로
            int i = 0, j = 0;
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (board[i][j] == ' ')//빈칸이면
                        break;    // 안쪽의 for 루프를 빠져 나간다.
                }

                if (board[i][j] == ' ')
                    break;    // 바깥 for 루프를 빠져나간다.
            }
            // 찾은 빈 곳에 돌을 놓는다.
            if (i < 3 && j < 3)
                board[i][j] = 'O';

        } while (true);


    }
}