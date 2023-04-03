package GameElements;

public class GameTile {

    private int tileValue;

    public GameTile()
    {
        tileValue = 0;
    }

    public int getTileValue() {
        return tileValue;
    }

    public void setTileValue(int tileValue) {
        if((tileValue % 2) != 0) return;
        if(tileValue < 0) return;

        this.tileValue = tileValue;
    }
}
