public abstract class Tile {

    int tileCoordinate;

    Tile(int tileCoordinate){
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileBusy();


    public abstract Piece getPiece();

    public static final  class  EmptyTile extends Tile{
        EmptyTile(int coordinate){
            super(coordinate);
        }

        @Override
        public boolean isTileBusy() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
    }



    public static final class BusyTile extends Tile{
        Piece pieceOnTile;
        BusyTile(int tileCoordinate, Piece pieceOnTile){
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public boolean isTileBusy() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }
}