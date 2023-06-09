package GameElements;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    final private  int noLines = 4;
    final private  int noColumns = 4;
    private GameTile[][] grid;

    private GameBoard() {
        grid = new GameTile[noLines][noColumns];

        for (int i = 0; i < noLines; i++) {
            for (int j = 0; j < noLines; j++) {
                grid[i][j] = new GameTile();
            }
        }


        TileNumberGenerator tileNumberGenerator = new TileNumberGenerator(this);
        tileNumberGenerator.generateNewTile();
        tileNumberGenerator.generateNewTile();
    }

    public int getNoLines() {
        return noLines;
    }

    public int getNoColumns() {
        return noColumns;
    }

    public GameTile[][] getGrid() {
        return grid;
    }

    public void setGridTileValue(int value, int linePoz, int columnPoz) {
        grid[linePoz][columnPoz].setTileValue(value);
    }

    public static GameBoard getInstance() {
        return new GameBoard();
    }
}
