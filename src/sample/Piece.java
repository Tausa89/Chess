package sample;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    private String pieceColor;
    private char type;
    protected List<MovePoint> possibleMoves = new ArrayList<>();

    public Piece(String pieceColor , char type) {
        this.pieceColor = pieceColor;
        this.type = type;

    }


    public abstract List<MovePoint> possibleMoves(Piece[][] board, int x , int y);



    @Override
    public String toString() {
        return "" + type;
    }

    public String getPieceColor() {
        return pieceColor;
    }

    public char getType() {
        return type;
    }

    public List<MovePoint> getPossibleMoves() {
        return possibleMoves;
    }
}
