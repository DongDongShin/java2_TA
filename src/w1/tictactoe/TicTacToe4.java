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

public class TicTacToe4 {
    public static void main(String[] args) throws InterruptedException{

        char[][] board = new char[3][3];  // 3x3 바둑판.
        int x, y;    // 바둑판의 좌표.

        Random r = new Random(1L);
        Scanner scan = new Scanner(System.in);

        System.out.println("Tic-Tac-Toe 게임입니다.");
        System.out.println("사람이 X, 컴퓨터가 O입니다.");

        // 바둑판을 초기화한다. (아홉 개의 방에 공백문자를 채운다.)
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
        printBoard(board);


        boolean end = false;
        String winner = null;

        while(!end){

            //사람의 입력을 받는다.
            System.out.print("0 이상 3 미만 정수 두 개 입력: ");

            x= scan.nextInt();
            y= scan.nextInt();

            while (!isInputValid(board, x, y)) {
                System.out.print("잘못된 위치입니다. 다시 입력하세요: ");
                x= scan.nextInt();
                y= scan.nextInt();
            }
            board[x][y] = 'X';
            printBoard(board);

            if (won(board,x,y)) {
                end = true;
                winner = "Human";
                continue;
            }
            if (boardFull(board)) {
                end = true;
                winner = "Nobody";
                continue;
            }

            TimeUnit.MILLISECONDS.sleep(300);

            int[] c = computerPlay(board, r);
            board[c[0]][c[1]] = 'O';

            printBoard(board);

            if (won(board,c[0],c[1])){
                end = true;
                winner = "Computer";
                continue;
            }
            if (boardFull(board)) {
                end = true;
                winner = "Nobody";
            }

        }

        if (winner.equals("Human")) {
            System.out.println("당신이 이겼습니다. 축하합니다.");
        } else if (winner.equals("Computer")) {
            System.out.println("당신이 졌습니다. 다시 도전하세요.");
        } else if (winner.equals("Nobody")) {
            System.out.println("비겼습니다. 막상막하군요.");
        }

        scan.close();


    }
    static void printBoard(char[][] board){
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i != 2)
                System.out.println("---|---|---");
        }
        System.out.println();

    }

    static boolean isInputValid(char[][] board, int x,int y){
        boolean valid = true;
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            valid = false;
        }
        else if(board[x][y] !=' ')
            return  false;

        return  valid;

    }

    static boolean won(char[][] board, int x, int y) {
        boolean allX = true;
        char remember = board[x][y];
        //행검사
        for (int j = 0; j < 3; j++) {
            if (board[x][j] != remember) {
                allX = false;
            }
        }
        if(allX)
            return true;

        //열 검사
        allX =true;
        for (int j = 0; j < 3; j++) {
            if (board[j][y] != remember) {
                allX = false;
            }
        }
        if(allX)
            return true;

        if (x == y) {
            allX = true;
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != remember) {
                    allX = false;
                }
            }
            if(allX)
                return  true;
        }

        if (x == 2 - y) {
            allX = true;
            for (int i = 0; i < 3; i++) {
                if (board[i][2-i] != remember) {
                    allX = false;
                }
            }
            if(allX)
                return  true;
        }

        return  false; //사람이 짐
    }

    /**
     * 보드가 꽉 차지 않으면 false를 반환
     * @param board
     * @return
     */
    static boolean boardFull(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]==' ')
                    return false;
            }
        }
        return true;
    }

    static int[] computerPlay(char[][] board, Random random) {
        int[] position = new int[2];
        int x,y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);

        } while (board[x][y] != ' ');
        position[0]=x;
        position[1]= y;
        return position;
    }




}