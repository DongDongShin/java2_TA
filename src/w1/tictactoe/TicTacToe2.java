package w1.tictactoe;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 오목과 비슷한 삼목 게임.
 * 사람이 놓는 돌 X
 * 컴퓨터가 놓는 돌 O
 * 사람이 먼저 돌을 놓는다.
 */

public class TicTacToe2 {
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

        boolean end = false;
        String winner = null;

       while(!end){

           //사람의 입력을 받는다.
           System.out.print("0 이상 3 미만 정수 두 개 입력: ");

           x= scan.nextInt();
           y= scan.nextInt();

           while (!isInputValid(board, x, y)) {
               System.out.println("잘못된 위치입니다. 다시 입력하세요: ");
               x= scan.nextInt();
               y= scan.nextInt();
           }
           board[x][y] = 'X';
           printBoard(board);

           if (humanWon(board,x,y)) {
               end = true;
               winner = "Human";
               continue;
           }
           if (boardFull(board)) {
               end = true;
               winner = "nobody";
               continue;
           }

           TimeUnit.MILLISECONDS.sleep(300);

           int[] c = computerPlay(board, r);
           board[c[0]][c[1]] = 'O';

           printBoard(board);

           if (computerWon(board,c[0],c[1])){
               end = true;
               winner = "computer";
               continue;
           }
           if (boardFull(board)) {
               end = true;
               winner = "nobody";
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


    }

    static boolean isInputValid(char[][] board, int x,int y){

        return true;

    }

    static boolean humanWon(char[][] board, int x, int y) {


        return  true;
    }

    static boolean computerWon(char[][] board, int x, int y) {


        return  true;
    }

    static boolean boardFull(char[][] board) {


        return true;
    }

    static int[] computerPlay(char[][] board, Random random) {
        int[] position = new int[2];
        position[0]=0;
        position[1]= 0;
        return position;
    }




}