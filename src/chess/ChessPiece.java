package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/**
 * ChessPiece
 */
public abstract class ChessPiece extends Piece {

    Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
