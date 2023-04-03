package GameController.MoveController;

import GameController.MoveOptions;
import GameController.TileNeighboursChecker;
import GameElements.GameBoard;

public class UpMoveOption implements MoveController{
    @Override
    public void move(GameBoard gameBoard) {
        TileNeighboursChecker checker = new TileNeighboursChecker(gameBoard);


        checker.checkMove(MoveOptions.UP);
    }
}
