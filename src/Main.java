import ConsoleDisplay.ScreenDisplayer;
import GameController.MoveController.MoveController;
import GameController.MoveController.UpMoveOption;
import GameElements.GameBoard;
import GameElements.TileNumberGenerator;

import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) {

        GameBoard gameBoard = GameBoard.getInstance();

        ScreenDisplayer.displayBoard(gameBoard);


        MoveController upOption = new UpMoveOption();


        TileNumberGenerator tileNumberGenerator = new TileNumberGenerator(gameBoard);

        while (true)
        {
            try {
                sleep(1000);


                System.out.println();
                upOption.move(gameBoard);
                tileNumberGenerator.generateNewTile();
                ScreenDisplayer.displayBoard(gameBoard);



            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

}