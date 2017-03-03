package Week7;


import java.util.Scanner;

public class Task12KrestikNolik {

    public static void main(String[] args) {
        int[][] gameBoard = new int[3][3];
        int player1=playerSelection(1);
        int player2=playerSelection(2);
            playing(gameBoard, player1,player2);
    }

    private static int playerSelection (int playersNumber){
        int playersWho=2;
        Scanner scanner = new Scanner(System.in);
        while ((playersWho!=0) && (playersWho!=1)) {
            System.out.println("Who is player " + playersNumber + ": Human or PC?");
            System.out.println("Please enter 0 for Human or 1 for PC");
            playersWho = scanner.nextInt();
        }
        return playersWho;
    }

    private static void playing(int [][] pole, int player1, int player2) {
        if ((player1 == 0) && (player2 == 0)) {
            while (true){
                if (stepHuman(pole, 1)) return;
                if (stepHuman(pole, 2)) return;
            }
        }
        if ((player1 == 0) && (player2 == 1)) {
            while (true) {
                if (stepHuman(pole, 1)) return;
                if (stepPC(pole, 2)) return;
            }
        }
        if ((player1 == 1) && (player2 == 0)) {
            while (true) {
                if (stepPC(pole, 1)) return;
                if (stepHuman(pole, 2)) return;
            }
        }
        if ((player1 == 1) && (player2 == 1)) {
            while (true) {
                if (stepPC(pole, 1)) return;
                if (stepPC(pole, 2)) return;
            }
        }
    }

    private static boolean stepHuman (int [][] pole, int playersNumber){
            printBoard(pole);
            System.out.println("player " + playersNumber + " moving");
            doMove(pole, playersNumber);
            if (isWin(pole)) {
                System.out.println("player " + playersNumber +" is win");
                printBoard(pole);
                return true;
            }
            if (isDraw(pole)) {
                System.out.println("Draw");
                printBoard(pole);
                return true;
            }
        return false;
    }

    private static boolean stepPC (int [][] pole, int playersNumber){
            printBoard(pole);
            System.out.println("player " + playersNumber + " moving");
            doMoveRobot(pole, playersNumber);
            if (isWin(pole)) {
                System.out.println("player " + playersNumber + " is win");
                printBoard(pole);
                return true;
            }
            if (isDraw(pole)) {
                System.out.println("Draw");
                printBoard(pole);
                return true;
            }
        return false;
    }


    private static boolean isWin(int[][] pole) {
        for (int i = 0; i < 3; i++) {
            if (((pole[i][0] == pole[i][1]) && (pole[i][1] == pole[i][2]) && (pole[i][0] != 0)) ||
                    ((pole[0][i] == pole[1][i]) && (pole[1][i] == pole[2][i]) && (pole[0][i] != 0)))
                return true;
        }
         if (((pole[0][0] == pole[1][1]) && (pole[1][1] == pole[2][2]) && (pole[0][0] != 0)) ||
                    ((pole[2][0] == pole[1][1]) && (pole[1][1] == pole[0][2]) && (pole[2][0] != 0)))
                return true;
        return false;
    }

    private static boolean isDraw(int[][] pole) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (pole[i][j] == 0) return false;
        return true;
    }

    private static void doMove(int[][] pole, int symbol) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter position of row (0-2):");
            int moveRow = scanner.nextInt();
            System.out.println("Please enter position of column (0-2):");
            int moveColumn = scanner.nextInt();
            if ((moveRow < 0) || (moveRow > 2) || (moveColumn < 0) || (moveColumn > 2))
                System.out.println("Please position 0-2");
            else if (pole[moveRow][moveColumn] != 0)
                System.out.println("Position " + moveRow + "-" + moveColumn + " is busy");
            else {
                pole[moveRow][moveColumn] = symbol;
                break;
            }
        }
    }

    private static void doMoveRobot(int[][] pole, int symbol) {
       int symbolTemp=symbol;
        for (int j=0; j<2; j++) { //сначала проверяем возможность выйграть, потом не проиграть.
           if ((j==1) && (symbol==1))
               symbolTemp=2;
                else if ((j==1) && (symbol==2))
                    symbolTemp=1;
            for (int i = 0; i < 3; i++) {
// Смотрим возможность по горизонтали
               if ((pole[i][0] == pole[i][1]) && (pole[i][0] == symbolTemp) && (pole[i][2] ==0)) {
                   pole[i][2] = symbol;
                   return;
               }
               if ((pole[i][1] == pole[i][2]) && (pole[i][1] == symbolTemp) && (pole[i][0] ==0)) {
                   pole[i][0] = symbol;
                   return;
               }
               if ((pole[i][0] == pole[i][2]) && (pole[i][0] == symbolTemp) && (pole[i][1] ==0)) {
                   pole[i][1] = symbol;
                   return;
               }
// Смотрим возможность по вертикали
               if ((pole[0][i] == pole[1][i]) && (pole[0][i] == symbolTemp) && (pole[2][i] ==0)) {
                   pole[2][i] = symbol;
                   return;
               }
               if ((pole[1][i] == pole[2][i]) && (pole[1][i] == symbolTemp) && (pole[0][i] ==0)) {
                   pole[0][i] = symbol;
                   return;
               }
               if ((pole[0][i] == pole[2][i]) && (pole[0][i] == symbolTemp) && (pole[1][i] ==0)) {
                   pole[1][i] = symbol;
                   return;
               }
           }
// Смотрим возможность по одной диагонали
           if ((pole[0][0] == pole[1][1]) && (pole[0][0] == symbolTemp) && (pole[2][2] ==0)) {
               pole[2][2] = symbol;
               return;
           }
           if ((pole[1][1] == pole[2][2]) && (pole[1][1] == symbolTemp) && (pole[0][0] ==0)) {
               pole[0][0] = symbol;
               return;
           }
           if ((pole[0][0] == pole[2][2]) && (pole[0][0] == symbolTemp) && (pole[1][1] ==0)) {
               pole[1][1] = symbol;
               return;
           }
// Смотрим возможность по другой диагонали
           if ((pole[2][0] == pole[1][1]) && (pole[2][0] == symbolTemp) && (pole[0][2] ==0)) {
               pole[0][2] = symbol;
               return;
           }
           if ((pole[1][1] == pole[0][2]) && (pole[1][1] == symbolTemp) && (pole[2][0] ==0)) {
               pole[2][0] = symbol;
               return;
           }
           if ((pole[2][0] == pole[0][2]) && (pole[2][0] == symbolTemp) && (pole[1][1] ==0)) {
               pole[1][1] = symbol;
               return;
           }
       }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (pole[i][j] == 0) {
                    pole[i][j] = symbol; //если возможности выйграть или проиграть нет, то ходим на пустое поле
                    return;
                }
            }
        }
    }

    private static void printBoard(int[][] pole) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + pole[i][j]);
            }
            System.out.println();
        }
    }
}
