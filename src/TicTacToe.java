/**
 * HomeWorkApp4
 *
 * @author Denis Glumov
 * @version 18.09.2021
 */

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
        System.out.println("Game init...");
    }

    void game() {
        System.out.println("Game start");
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWindiag(SIGN_X) || checkWinLine(SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            if (checkWindiag(SIGN_O) || checkWinLine(SIGN_O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printTable();
    }

    void initTable() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                table[row][col] = SIGN_EMPTY;
    }

    void printTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter X and Y (1..3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3)
            return false;
        return table[y][x] == SIGN_EMPTY;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean checkWindiag(char dot) {
        int chekright = 0;
        int chekleft = 0;
        for (int i = 0; i < 3; i++) {
            if (table[i][i] == dot) {
                chekleft += 1;
            }
            if (table[3 - i - 1][i] == dot) {
                chekright += 1;
            }
        }
        return chekright == 3 || chekleft == 3;
    }

    boolean checkWinLine(char dot) {
        boolean cols = false;
        boolean rows = false;
        for (int i = 0; i < 3; i++) {
            int liney = 0;
            int linex = 0;
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == dot) {
                    linex += 1;
                }
                if (linex == 3) {
                    rows = true;
                }
                if (table[j][i] == dot) {
                    liney += 1;
                }
                if (liney == 3) {
                    cols = true;
                }
            }
        }
        return cols || rows;
    }

    boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] == SIGN_EMPTY)
                    return false;
        return true;
    }

}
