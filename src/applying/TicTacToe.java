package applying;


public class TicTacToe {
    char[][] board;

    //Construtor
    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }

    // initialize board
    void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int column, char mark) {
        if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
            board[row][column] = mark;
        } else {
            System.out.println("Wrong Entry Detected");
        }
    }

    boolean checkColWin() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
            return false;
        }
        return false;
    }
    boolean checkRowWin(){
        for (int i=0; i<=2; i++){
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
            return true;
            }

        }
        return false;
    }
    boolean checkDiagonalWin(){
        for(int i=0; i<2; i++){
            for(int j=0; j<=2; j++){
                if (board[0][0]==board[1][1] && board[1][1]==board[2][2]){
                    return true;
                }
                    if (board[0][2]==board[1][1] && board[1][1] == board[2][0]){
                        return true;
                }
                    return false;
            }
        }
        return false;
    }

    }
