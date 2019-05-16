package sample;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {


    public King(String pieceColor, char type) {
        super(pieceColor, type);
    }

    @Override
    public List move(Piece[][] board, int x, int y) {

        if(((x-1) >=0) && board[x-1][y] == null){
            possibleMoves.add("You can move to position " + (x-1) + " " + (y) );

        } else if (((x-1) >=0) && board[x-1][y] != null && board[x-1][y].getPieceColor().equals("Black")){
            possibleMoves.add("You can take down opponent Piece on position " + (x-1) + (y));
        }
        if(((y+1) <8) && (board[x][y+1] == null)){
            possibleMoves.add("You can move to position " + (x) + " " + (y+1) );

        } else if (((y+1) <8) && board[x][y+1] != null && board[x][y+1].getPieceColor().equals("Black")){
            possibleMoves.add("You can take down opponent Piece on position " + (x) + (y+1));
        }
        if(((y-1) >=0) && board[x][y-1] == null){
            possibleMoves.add("You can move to position " + (x) + " " + (y-1) );

        } else if (((y-1) >=0) && board[x][y-1] != null && board[x][y-1].getPieceColor().equals("Black")){
            possibleMoves.add("You can take down opponent Piece on position " + (x-1) + (y));
        }
        if(((x+1) < 8) && board[x+1][y] == null){
            possibleMoves.add("You can move to position " + (x+1) + " " + (y) );

        } else if (((x+1) <8) && board[x+1][y] != null && board[x+1][y].getPieceColor().equals("Black")){
            possibleMoves.add("You can take down opponent Piece on position " + (x-1) + (y));
        }

        for(String moves : possibleMoves){
            System.out.println(moves);
        }

        return possibleMoves;

    }
}