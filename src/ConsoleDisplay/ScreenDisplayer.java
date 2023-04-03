package ConsoleDisplay;

import GameElements.GameBoard;

public class ScreenDisplayer {

    public static void clearConsole() // you can't clear the IntelliJ terminal,
    // so you the solution I came with was to add 10 new lines
    {
        int noNewLines = 10;
        for (int i = 0; i < noNewLines; i++) {
            System.out.println();
        }
    }

    public static void displayBoard(GameBoard gameBoard)
    {
        for (int i = 0; i < gameBoard.getNoLines(); i++) {
            for (int j = 0; j < gameBoard.getNoColumns(); j++) {
                System.out.print(
                        gameBoard
                        .getGrid()[i][j]
                        .getTileValue() + " ");
            }
            System.out.println();
        }
    }
}
