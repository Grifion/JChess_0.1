package  com.chess.engine.pieces;

import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import java.util.List;

public abstract class Piece {

    protected final int peacePosition;

    protected final Alliance piaceAlliance;


    Piece(final int peacePosition, final Alliance piaceAlliance){
        this.peacePosition = peacePosition;
        this.piaceAlliance = piaceAlliance;

    }
    public abstract List<Move> calculateLegalMoves(final Board board);
}
