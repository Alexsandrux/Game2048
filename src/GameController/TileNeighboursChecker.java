package GameController;

import GameElements.GameBoard;

public class TileNeighboursChecker {
    GameBoard gameBoard;

    public TileNeighboursChecker(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void checkMove(MoveOptions option) {
        switch (option) {
            case UP -> checkColumn(true);
            case DOWN ->  checkColumn(false);
            case LEFT -> checkRow(true);
            case RIGHT ->  checkRow(false);
        }
    }

    // I repeat code in the next two methods or the methods are doing two things
    private void checkRow(boolean fromTheRightMost) {

    }

    private void checkColumn(boolean fromTheBottom) {
        int linePoz = -1;

        if(fromTheBottom)
        {
            for (int j = 0; j < gameBoard.getNoColumns(); j++) {
                for (int i = gameBoard.getNoLines() - 1; i >= 0; i--) {
                    // IDEA: WE CHECK IF THE CALUE EXIST IN THE COLUMN
                    // I CHECK IF THERE ARE OTHER NUMBERS IN BETWEEN
                    // IF THEY DON'T I ADD THEM, IF THEY ARE WE DON'T
                    // THEN WE CHECK FOR ZEROS :
                    // IF AFTER WE ADD THERE ARE STILL ZEROS AFTER THE NEW NUMBER WE MOVE THE NUMBER TO THE TOP
                    // IF WE COULDN'T GET A NEW NUMBER WE CHECK IF THERE IS A ZERO IN BETWEEN

                    if (gameBoard.getGrid()[i][j].getTileValue() != 0)
                    {
                        int valueToCheck = gameBoard.getGrid()[i][j].getTileValue();

                        for (int k = (i - 1); k >= 0; k--) {

                            if(gameBoard.getGrid()[k][j].getTileValue() == valueToCheck)
                            {
                                gameBoard.setGridTileValue(valueToCheck * 2, k, j);
                                gameBoard.setGridTileValue(0, i, j);
                                break;
                            }
                            else if(((k + 1) != i) && gameBoard.getGrid()[k + 1][j].getTileValue() == 0){
                                gameBoard.setGridTileValue(valueToCheck, k + 1, j);
                                gameBoard.setGridTileValue(0, i, j);
                                break;
                            }
                        }
                    }
                }
            }


        }
    }
}
