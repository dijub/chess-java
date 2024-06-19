package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 * King
 */
public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        if (getColor() == Color.WHITE) {

            return "♔";
        } else {
            return "♚";
        }
    }

}