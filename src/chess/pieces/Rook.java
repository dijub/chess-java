package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 * Rook
 */
public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        if (getColor() == Color.WHITE) {
            return "♖";
        } else {
            return "♜";
        }

    }

}