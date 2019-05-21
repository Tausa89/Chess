package sample;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    public Rook(String pieceColor, char type) {
        super(pieceColor, type);
    }



    @Override
    public List<MovePoint> possibleMoves(Piece[][] board, int x, int y) {

        int nextPosition = x - 1;

        while(nextPosition >= 0){
            if(board[nextPosition][y] == null){
                if(!possibleMoves.contains(new MovePoint(nextPosition,y))) {
                    possibleMoves.add(new MovePoint(nextPosition, y));
                }

            }

            else if(board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals(board[x][y].getPieceColor())){
                break;
            }
//            else if(board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals("Black")){
//                possibleMoves.add("You can take down opponent Piece on position " + nextPosition + " " + y);
//                break;
//            }
            nextPosition--;
        }
        nextPosition = x +1;
        while(nextPosition < 8){
            if(board[nextPosition][y] == null){
                if(!possibleMoves.contains(new MovePoint(nextPosition,y))) {
                    possibleMoves.add(new MovePoint(nextPosition, y));
                }
            }

            else if(board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals(board[x][y].getPieceColor())){
                break;
            }


//            else if(board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals("Black")){
//                possibleMoves.add("You can take down opponent Piece on position " + nextPosition + " " + y);
//                break;
//            }
            nextPosition++;
        }
        nextPosition = y - 1;
        while(nextPosition >= 0){
            if(board[x][nextPosition] == null){
                if(!possibleMoves.contains(new MovePoint(x,nextPosition))) {
                    possibleMoves.add(new MovePoint(x, nextPosition));
                }
            }

            else if(board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals(board[x][y].getPieceColor())){
                break;
            }
//            else if(board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals("Black")){
//                possibleMoves.add("You can take down opponent Piece on position " + x + " " + nextPosition);
//                break;
//            }
            nextPosition--;
        }

        nextPosition = y + 1;
        while(nextPosition < 8){
            if(board[x][nextPosition] == null){
                if(!possibleMoves.contains(new MovePoint(x,nextPosition))) {
                    possibleMoves.add(new MovePoint(x, nextPosition));
                }
            }
            else if(board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals(board[x][y].getPieceColor())){
                break;
            }
//            else if(board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals("Black")){
//                possibleMoves.add("You can take down opponent Piece on position " + x + " " + nextPosition);
//                break;
//            }
            nextPosition++;
        }

        for(MovePoint moves : possibleMoves){
            System.out.println(moves);
        }

        return possibleMoves;
    }
}
