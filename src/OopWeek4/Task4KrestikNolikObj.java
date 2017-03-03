package OopWeek4;


import java.util.Scanner;

public class Task4KrestikNolikObj {

    public static void main (String [] args) {
        Game g = new Game ();
        g.play();
    }
}

class Player{
    protected int symbol;

    Move getMove(Board b) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Please enter position of row (0-2):");
                int scannerRow = scanner.nextInt();
                System.out.println("Please enter position of column (0-2):");
                int scannerColumn = scanner.nextInt();
                    if ((scannerRow < 0) || (scannerRow > 2) || (scannerColumn < 0) || (scannerColumn > 2)) {
                        System.out.println("Please position 0-2");
                        }else {
                            Move move = new Move(scannerRow, scannerColumn, this);
                            return move;
                        }
            }
        }
    int getSymbol(){
        return symbol;
    }

    Player(int symbol){
        this.symbol=symbol;
    }
}

class PlayerPC extends Player {

    PlayerPC (int symbol) {
    super(symbol);
    }
@Override

    Move getMove(Board b) {
            int symbolTemp=symbol;
            for (int j=0; j<2; j++) { //сначала проверяем возможность выйграть, потом не проиграть.
                if ((j==1) && (symbol==1))
                    symbolTemp=2;
                else if ((j==1) && (symbol==2))
                    symbolTemp=1;
                for (int i = 0; i < 3; i++) {
// Смотрим возможность по горизонтали
                    if ((b.getCell(i,0) == b.getCell(i,1)) && (b.getCell(i,0) == symbolTemp) && (b.getCell(i,2) ==0)) {
                        Move move = new Move(i, 2, this);
                        return move;
                    }
                    if ((b.getCell(i,1) == b.getCell(i,2)) && (b.getCell(i,1) == symbolTemp) && (b.getCell(i,0) ==0)) {
                        Move move = new Move(i, 0, this);
                        return move;
                    }
                    if ((b.getCell(i,0) == b.getCell(i,2)) && (b.getCell(i,0) == symbolTemp) && (b.getCell(i,1) ==0)) {
                        Move move = new Move(i, 1, this);
                        return move;
                    }
// Смотрим возможность по вертикали
                    if ((b.getCell(0,i) == b.getCell(1,i)) && (b.getCell(0,i) == symbolTemp) && (b.getCell(2,i) ==0)) {
                        Move move = new Move(2, i, this);
                        return move;
                    }
                    if ((b.getCell(1,i) == b.getCell(2,i)) && (b.getCell(1,i) == symbolTemp) && (b.getCell(0,i) ==0)) {
                        Move move = new Move(0, i, this);
                        return move;
                    }
                    if ((b.getCell(0,i) == b.getCell(2,i)) && (b.getCell(0,i) == symbolTemp) && (b.getCell(1,i) ==0)) {
                        Move move = new Move(1, i, this);
                        return move;
                    }
                }
// Смотрим возможность по одной диагонали
                if ((b.getCell(0,0) == b.getCell(1,1)) && (b.getCell(0,0) == symbolTemp) && (b.getCell(2,2) ==0)) {
                    Move move = new Move(2, 2, this);
                    return move;
                }
                if ((b.getCell(1,1) == b.getCell(2,2)) && (b.getCell(1,1) == symbolTemp) && (b.getCell(0,0) ==0)) {
                    Move move = new Move(0, 0, this);
                    return move;
                }
                if ((b.getCell(0,0) == b.getCell(2,2)) && (b.getCell(0,0) == symbolTemp) && (b.getCell(1,1) ==0)) {
                    Move move = new Move(1, 1, this);
                    return move;
                }
// Смотрим возможность по другой диагонали
                if ((b.getCell(2,0) == b.getCell(1,1)) && (b.getCell(2,0) == symbolTemp) && (b.getCell(0,2) ==0)) {
                    Move move = new Move(0, 2, this);
                    return move;
                }
                if ((b.getCell(1,1) == b.getCell(0,2)) && (b.getCell(1,1) == symbolTemp) && (b.getCell(2,0) ==0)) {
                    Move move = new Move(2, 0, this);
                    return move;
                }
                if ((b.getCell(2,0) == b.getCell(0,2)) && (b.getCell(2,0) == symbolTemp) && (b.getCell(1,1) ==0)) {
                    Move move = new Move(1, 1, this);
                    return move;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (b.getCell(i,j) == 0) {
                        //если возможности выйграть или проиграть нет, то ходим на пустое поле
                        Move move = new Move(i, j, this);
                        return move;
                    }
                }
            }
    return null;
    }
}

class Move {
    private Player p;
    private int moveRow;
    private int moveColumn;

    public Move(int moveRow, int moveColumn, Player p) {
        this.moveRow = moveRow;
        this.moveColumn = moveColumn;
        this.p = p;
    }

    public int getMoveRow() {
        return moveRow;
    }

    public int getMoveColumn() {
        return moveColumn;
    }

    public Player getPlayer() {
        return p;
    }
}


class Board {

    private int[][] gameBoard;

    Board() {
        gameBoard = new int [3][3];
    }

    public boolean isMoveValid(int moveRow, int moveColumn){
        if (gameBoard[moveRow][moveColumn] != 0) {
            System.out.println("Position " + moveRow + "-" + moveColumn + " is busy");
            return false;
        } else {
            return true;
        }
    }

    public boolean isWin() {
        for (int i = 0; i < 3; i++) {
            if (((gameBoard[i][0] == gameBoard[i][1]) && (gameBoard[i][1] == gameBoard[i][2]) && (gameBoard[i][0] != 0)) ||
                    ((gameBoard[0][i] == gameBoard[1][i]) && (gameBoard[1][i] == gameBoard[2][i]) && (gameBoard[0][i] != 0)))
                return true;
        }
        if (((gameBoard[0][0] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[2][2]) && (gameBoard[0][0] != 0)) ||
                ((gameBoard[2][0] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[0][2]) && (gameBoard[2][0] != 0)))
            return true;
        return false;
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (gameBoard[i][j] == 0) return false;
        return true;
    }

    public void printBoard (){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public int getCell (int i, int j){
        return gameBoard[i][j];
    }

    public void setCell (int i, int j, int symbol) {
        gameBoard[i][j]=symbol;
    }

}

class Game {
    private Board b;
    private Player p1;
    private Player p2;
    private Player current;

    void play () {
        current=p1;
        while (true) {
            b.printBoard();
            System.out.println("Ход игрока "+current.getSymbol());
            while (true) {
                Move move = current.getMove(b);
                if (b.isMoveValid(move.getMoveRow(), move.getMoveColumn())) {
                    b.setCell(move.getMoveRow(), move.getMoveColumn(), current.getSymbol());
                    break;
                }
            }
            if (b.isWin()) {
                System.out.println("Победа игрока "+current.getSymbol());
                b.printBoard();
                break;
            }
            if (b.isDraw()) {
                System.out.println("Ничья");
                b.printBoard();
                break;
            }
            if (current==p1) {
                current=p2;
            } else {
                current=p1;
            }
        }
    }

    void playerSelection (){
        int playersWho=2;
        Scanner scanner = new Scanner(System.in);
        while ((playersWho!=0) && (playersWho!=1)) {
            System.out.println("Who is player 1 : Human or PC?");
            System.out.println("Please enter 0 for Human or 1 for PC");
            playersWho = scanner.nextInt();
        }
        if (playersWho==0) {
            p1 = new Player(1);
        } else {
            p1 = new PlayerPC(1);
        }
        playersWho=2;
        while ((playersWho!=0) && (playersWho!=1)) {
            System.out.println("Who is player 2 : Human or PC?");
            System.out.println("Please enter 0 for Human or 1 for PC");
            playersWho = scanner.nextInt();
        }
        if (playersWho==0) {
            p2 = new Player(2);
        } else {
            p2 = new PlayerPC(2);
        }
    }

    Game () {
        b = new Board();
        playerSelection();
    }
}