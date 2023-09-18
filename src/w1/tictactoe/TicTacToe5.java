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

public class TicTacToe5 {

    static final int PLAYING = 0;
    static final int DRAW = 1;
    static final int CROSS_WON = 2;
    static final int NOUGHT_WON = 3;
    static int size;

    static char[][] board;
    static Scanner scan = new Scanner(System.in);

    static char currenMark;
    static int x, y;
    static int state;

    static final Random r = new Random(1L);


    public static void main(String[] args) throws InterruptedException {


//        System.out.println("Tic-Tac-Toe 게임입니다.");
//        System.out.println("사람이 X, 컴퓨터가 O입니다.");

        // 바둑판을 초기화한다. (아홉 개의 방에 공백문자를 채운다.)
        initGame();
        printBoard();


        boolean end = false;

        while (!end) {
            humanPlay();
            printBoard();
             state = checkGame();

            if (state != PLAYING) {
                end = true;
                continue;
            }
            TimeUnit.MILLISECONDS.sleep(300);
            computerPlay();
            printBoard();
            state = checkGame();
            if (state != PLAYING) {
                end = true;
            }

        }

        printResult();


//        if (winner.equals("Human")) {
//            System.out.println("당신이 이겼습니다. 축하합니다.");
//        } else if (winner.equals("Computer")) {
//            System.out.println("당신이 졌습니다. 다시 도전하세요.");
//        } else if (winner.equals("Nobody")) {
//            System.out.println("비겼습니다. 막상막하군요.");
//        }

        scan.close();


    }

    static void printBoard() {
        System.out.println();
        for (int i = 0; i < size; i++) { //정사각형... 아 이거 어떻게 출력하징
            System.out.print(" ");
            for (int j = 0; j < size-1; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println(board[i][size-1]);
            if (i != size - 1){
                for (int j = 0; j < size * 4-1; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
        System.out.println();

    }

    static void initGame() {
        //게임을 초기화 하는 것임

        System.out.println("Tic-Tac-toe 게임입니다.");
        System.out.println("사람이 X, 컴퓨터가 O입니다.");
        System.out.println("바둑판 크기: ");

        size = scan.nextInt();
        board = new char[size][size];

        state = PLAYING;


        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                board[i][j] = ' ';
    }

    static boolean isInputValid() {
        boolean valid = true;
        if (x < 0 || x > size || y < 0 || y > size) {
            valid = false;
        } else if (board[x][y] != ' ')
            return false;

        return valid;

    }

    static void humanPlay() {

        currenMark = 'X';

        boolean validInput = false;

        do {
            System.out.print("0"+" 이상 "+size+" 미만 정수 두개 입력:");

            x = scan.nextInt();
            y = scan.nextInt();
            if (isInputValid()) {
                validInput = true;

            } else
                System.out.println("잘못된 위치입니다. 다시 입력하세요: ");

        } while (!validInput);

        board[x][y] = 'X';
    }

    static int checkGame() {
        int state = PLAYING;
        if (won()) {
            if (currenMark == 'X')
                state = CROSS_WON;
            else if (currenMark == 'O')
                state = NOUGHT_WON;
        } else if (boardFull())
            state = DRAW;
        return state;
    }

    static void printResult() {
        switch (state) {
            case CROSS_WON:
                System.out.println("당신이 이겼습니다. 축하합니다.");
                break;

            case NOUGHT_WON:
                System.out.println("당신이 졌습니다. 다시 도전하세요.");
                break;

            case DRAW:
                System.out.println("비겼습니다. 막상막하군요.");
        }

    }

    static boolean won() {
        char currentMark = board[x][y];
        boolean allCurrentMark = true;
        //행검사
        for (int j = 0; j < size; j++) {
            if (board[x][j] != currentMark) {
                allCurrentMark = false;
            }
        }
        if (allCurrentMark)
            return true;

        //열 검사
        allCurrentMark = true;
        for (int j = 0; j < size; j++) {
            if (board[j][y] != currentMark) {
                allCurrentMark = false;
            }
        }
        if (allCurrentMark)
            return true;

        if (x == y) {
            allCurrentMark = true;
            for (int i = 0; i < size; i++) {
                if (board[i][i] != currentMark) {
                    allCurrentMark = false;
                }
            }
            if (allCurrentMark)
                return true;
        }

        if (x == size - y - 1) {
            allCurrentMark = true;
            for (int i = 0; i < size; i++) {
                if (board[i][size - i - 1] != currentMark) {
                    allCurrentMark = false;
                }
            }
            if (allCurrentMark)
                return true;
        }

        return false; //사람이 짐
    }

    /**
     * 보드가 꽉 차지 않으면 false를 반환
     *
     * @param board
     * @return
     */
    static boolean boardFull() {
        boolean full = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ')
                    full = false;
            }
        }
        return full;
    }

    static void computerPlay() {
        currenMark = 'O';

        do {
            x = r.nextInt(size);
            y = r.nextInt(size);

        } while (board[x][y] != ' ');
        board[x][y] = 'O';
    }


}