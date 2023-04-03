package GameElements;


import java.util.Arrays;
import java.util.Random;

public class TileNumberGenerator {
    GameBoard gameBoard;

    public TileNumberGenerator(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }


    public void generateNewTile() {
        boolean isGameOver = true;
        for (int i = 0; i < gameBoard.getNoLines(); i++) {
            for (int j = 0; j < gameBoard.getNoColumns(); j++) {
                if(gameBoard.getGrid()[i][j].getTileValue() == 0)
                {
                    isGameOver = false;
                    break;
                }
            }
            if(!isGameOver) break;
        }

        if(isGameOver) {
            System.out.println("Game over");
            return;
        }

        Random random = new Random();

        int poz = random.nextInt(16);

        int colPoz = poz % 4;
        int linePoz = poz / 4;

        if(gameBoard.getGrid()[linePoz][colPoz].getTileValue() != 0)
        {
            generateNewTile();
        }
        else {
            gameBoard.setGridTileValue(random.nextInt(1,3) * 2, linePoz, colPoz);
        }
    }
}
