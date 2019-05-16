package sample;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {

    public Bishop(String pieceColor, char type) {
        super(pieceColor, type);
    }

    @Override
    public List move(Piece[][] board, int x, int y) {

        int nextPositionX = x - 1;
        int nextPositionY = y - 1;

        while (nextPositionX >= 0 && nextPositionY >= 0) {
            if (board[nextPositionX][nextPositionY] == null) {
                possibleMoves.add("You can move to " + nextPositionX + " " + nextPositionY);
            } else if(board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals("Black") ){
                possibleMoves.add("You can take down opponent Piece on position " + nextPositionX + " " + nextPositionY);

            }
            nextPositionX--;
            nextPositionY--;
        }

        nextPositionX = x - 1;
        nextPositionY = y + 1;


        while (nextPositionX >= 0 && nextPositionY < 8) {
            if (board[nextPositionX][nextPositionY] == null) {
                possibleMoves.add("You can move to " + nextPositionX + " " + nextPositionY);
            }  else if(board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals("Black") ){
                possibleMoves.add("You can take down opponent Piece on position " + nextPositionX + " " + nextPositionY);

            }
            nextPositionX--;
            nextPositionY++;
        }

        nextPositionX = x + 1;
        nextPositionY = y + 1;

        while (nextPositionX < 8  && nextPositionY < 8) {
            if (board[nextPositionX][nextPositionY] == null) {
                possibleMoves.add("You can move to " + nextPositionX + " " + nextPositionY);
            } else if(board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals("Black") ){
                possibleMoves.add("You can take down opponent Piece on position " + nextPositionX + " " + nextPositionY);

            }
            nextPositionX++;
            nextPositionY++;
        }

        nextPositionX = x + 1;
        nextPositionY = y - 1;

        while (nextPositionX < 8 && nextPositionY >= 0) {
            if (board[nextPositionX][nextPositionY] == null) {
                possibleMoves.add("You can move to " + nextPositionX + " " + nextPositionY);
            } else if(board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals("Black") ){
                possibleMoves.add("You can take down opponent Piece on position " + nextPositionX + " " + nextPositionY);

            }
            nextPositionX++;
            nextPositionY--;
        }

        for(String moves : possibleMoves){
            System.out.println(moves);
        }

        return possibleMoves;


    }
}
