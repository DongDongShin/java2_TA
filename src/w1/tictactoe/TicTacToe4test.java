package w1.tictactoe;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 오목과 비슷한 삼목 게임.
 * 사람이 놓는 돌 O
 * 컴퓨터가 놓는 돌 X
 * 사람이 먼저 돌을 놓는다.
 */

import java.util.Random;

import java.util.Scanner;

import java.util.concurrent.TimeUnit;



public class TicTacToe4test {

    public static void main(String[] args) throws InterruptedException {



        char[][] board = new char[3][3];

        int x, y;

        Random r = new Random(1L);



        Scanner sc = new Scanner(System.in);



        System.out.println("Tic-Tac-Toe 게임입니다.");

        System.out.println("사람이 X, 컴퓨터가 O입니다.");



        for (int i = 0; i<3; i++)

            for (int j =0; j<3; j++)

                board[i][j] = ' ';



        printBoard(board);



        boolean end = false;

        String winner = null;



        while (!end) {



            System.out.print("0 이상 3미만 정수 두 개 입력:");

            x = sc.nextInt();

            y = sc.nextInt();



            while (!isInputValid(board, x, y)) {

                System.out.print("잘못된 위치입니다. 다시 입력하세요. :");

                x = sc.nextInt();

                y = sc.nextInt();

            }

            board[x][y] = 'X';



            printBoard(board);







            TimeUnit.MILLISECONDS.sleep(300);



            int[] c = computerPlay(board, r);

            board[c[0]][c[1]] = 'O';



            printBoard(board);



            if (Won(board, 'X', x, y)) {
                end = true;
                winner = "Human";
                continue;
            }



            if (Won(board, 'O', c[0], c[1])) {

                end = true;

                winner = "Computer";

                continue;

            }



            if (boardFull(board)) {
                end = true;
                winner = "Nobody";
                continue;

            }

        }

        if(winner.equals("Human"))

            System.out.println("당신이 이겼습니다. 축하합니다.");

        else if (winner.equals("Computer"))

            System.out.println("당신이 졌습니다. 다시 도전하세요.");

        else if (winner.equals("Nobody"))

            System.out.println("비겼습니다. 막상막하군요.");



        sc.close();

    }

    /***

     * 현재 바둑판 상태에서 컴픁처가 돌ㅇ늘 놓을 자리를 결정한다.

     * 값 두 개를 반환해야 하므로 두 값을 배열에 넣어 반환한다,

     * @param board

     * @param x

     * @param y

     * @return

     */

    static boolean Won(char[][] board, char player, int x, int y) {

        boolean allPlayer = true;
        // 가로 체크

        for (int j = 0; j < 3; j++) {

            if (board[x][j] != player) {

                allPlayer = false;

                break;

            }

        }

        if (allPlayer) return true;



        // 세로 체크

        allPlayer = true;

        for (int i = 0; i < 3; i++) {

            if (board[i][y] != player) {

                allPlayer = false;

                break;

            }

        }

        if (allPlayer) return true;



        // 대각선 체크

        if (x == y) {

            allPlayer = true;

            for (int i = 0; i < 3; i++) {

                if (board[i][i] != player) {

                    allPlayer = false;

                    break;

                }

            }

            if (allPlayer) return true;

        }



        // 역대각선 체크

        if (x == 2 - y) {

            allPlayer = true;

            for (int i = 0; i < 3; i++) {

                if (board[i][2 - i] != player) {

                    allPlayer = false;

                    break;

                }

            }

            if (allPlayer) return true;

        }



        return false;

    }





    static int[] computerPlay(char[][] board, Random r) {

        // TODO Auto-generated method stub

        int[] position = new int[2];

        int x, y;



        do {

            x = r.nextInt(3);

            y = r.nextInt(3);

        }while(board[x][y] != ' ');



        position[0] = x;

        position[1] = y;

        return position;

    }



    static boolean boardFull(char[][] board) {
        for (int i = 0 ; i < 3 ; i++)
            for (int j = 0 ; j< 3 ; j++) {
                if(board[i][j] == ' ')
                    return false;
            }
        return true;
    }





    static boolean isInputValid(char[][] board, int x, int y) {

        boolean valid = true;

        if (x < 0 || x > 2|| y < 0 || y > 2 )

            valid = false;

        else if (board[x][y] != ' ')

            valid = false;



        return valid;

    }



    static void printBoard(char[][] board) {

        System.out.println();

        for (int i = 0; i < 3 ; i++) {

            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);

            if (i != 2)

                System.out.println("---|---|---");

        }

        System.out.println();

    }



}