package sample;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    private String pieceColor;
    private char type;
    protected List<MovePoint> possibleMoves = new ArrayList<>();
    protected List<MovePoint> possibleTakeDowns = new ArrayList<>();

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

    public List<MovePoint> getPossibleTakeDowns() {
        return possibleTakeDowns;
    }

    public void printMoves() {

        System.out.println("Move options");
        if(possibleMoves.isEmpty()) {
            System.out.println("No moves");
        }else {
            for (MovePoint moves : possibleMoves) {
                System.out.println(moves);
            }
        }
        System.out.println("Take down options");
        if(possibleTakeDowns.isEmpty()){
            System.out.println("No take down option");
        }else {
            for (MovePoint moves : possibleTakeDowns) {
                System.out.println(moves);
            }
        }
    }
}
