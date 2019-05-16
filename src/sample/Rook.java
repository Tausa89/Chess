package sample;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    public Rook(String pieceColor, char type) {
        super(pieceColor, type);
    }



    @Override
    public List move(Piece[][] board, int x, int y) {

        int nextPosition = x - 1;

        while(nextPosition >= 0){
            if(board[nextPosition][y] == null){
                possibleMoves.add("You can move to position " + nextPosition + " " + y);
            }
            else if(board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals("Black")){
                possibleMoves.add("You can take down opponent Piece on position " + nextPosition + " " + y);
                break;
            }
            nextPosition--;
        }
        nextPosition = x +1;
        while(nextPosition < 8){
            if(board[nextPosition][y] == null){
                possibleMoves.add("You can move to position " + nextPosition + " " + y);
            }
            else if(board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals("Black")){
                possibleMoves.add("You can take down opponent Piece on position " + nextPosition + " " + y);
                break;
            }
            nextPosition++;
        }
        nextPosition = y - 1;
        while(nextPosition >= 0){
            if(board[x][nextPosition] == null){
                possibleMoves.add("You can move to position " + x + " " + nextPosition);
            }
            else if(board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals("Black")){
                possibleMoves.add("You can take down opponent Piece on position " + x + " " + nextPosition);
                break;
            }
            nextPosition--;
        }

        nextPosition = y + 1;
        while(nextPosition < 8){
            if(board[x][nextPosition] == null){
                possibleMoves.add("You can move to position " + x + " " + nextPosition);
            }
            else if(board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals("Black")){
                possibleMoves.add("You can take down opponent Piece on position " + x + " " + nextPosition);
                break;
            }
            nextPosition++;
        }

        for(String moves : possibleMoves){
            System.out.println(moves);
        }

        return possibleMoves;
    }
}
