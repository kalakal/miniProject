package applying;

import java.util.Scanner;

public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Select the box you want to place the character");
        Scanner sc= new Scanner(System.in);
        TicTacToe ttt = new TicTacToe();
        ttt.placeMark(0,0,'x');
        ttt.placeMark(0,1,'x');
        ttt.placeMark(0,2,'o');
        ttt.placeMark(1,1,'o');
        ttt.placeMark(0,0,'x');
        ttt.placeMark(1,1,'x');
        ttt.placeMark(2,2,'x');

       ttt.displayBoard();
        System.out.println(ttt.checkColWin());

        System.out.println(ttt.checkRowWin());

        System.out.println(ttt.checkDiagonalWin());
    }
}
