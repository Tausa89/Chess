package sample;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {

    public Knight(String pieceColor, char type) {
        super(pieceColor, type);
    }

    @Override
    public List<MovePoint> possibleMoves(Piece[][] board, int x, int y) {


        if((x-1 >=0 && y-2 >=0) && board[x-1][y-2] == null){
            possibleMoves.add(new MovePoint(x-1,y-2));
        }
//        else if (board[x-1][y-2] != null && board[x-1][y-2].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x-1) + " " +(y-2));
        if((x-1 >=0 && y+2 <8) && board[x-1][y+2] == null){
            possibleMoves.add(new MovePoint(x-1,y+2));
        }
//        else if (board[x-1][y+2] != null && board[x-1][y+2].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x-1) + " " +(y+2));
        if((x+1 <8 && y-2 >=0) && board[x+1][y-2] == null){
            possibleMoves.add(new MovePoint(x+1,y-2));
        }
//        else if (board[x+1][y-2] != null && board[x+1][y-2].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x+1) + " " +(y-2));
        if((x+1 <8 && y+2 <8) && board[x+1][y+2] == null){
            possibleMoves.add(new MovePoint(x+1,y+2));
        }
//        else if (board[x+1][y+2] != null && board[x+1][y+2].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x+1) + " " +(y+2));
        if((x-2 >=0 && y+1 <8) && board[x-2][y+1] == null){
            possibleMoves.add(new MovePoint(x-2,y+1));
        }
//        else if (board[x-2][y+1] != null && board[x-2][y+1].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x-2) + " " +(y+1));
        if((x-2 >=0 && y-1 >=0) && board[x-2][y-1] == null){
            possibleMoves.add(new MovePoint(x-2,y-1));
        }
//        else if (board[x-2][y-1] != null && board[x-2][y-1].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x-2) + " " +(y-1));
        if((x+2 <8 && y+1 <8) && board[x+2][y+1] == null){
            possibleMoves.add(new MovePoint(x+2,y+1));
        }
//        else if (board[x+2][y+1] != null && board[x+2][y+1].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x+2) + " " +(y+1));
        if((x+2 <8 && y-1 >=0) && board[x+2][y-1] == null){
            possibleMoves.add(new MovePoint(x+2,y-1));
        }
//        else if (board[x+2][y-1] != null && board[x+2][y-1].getPieceColor().equals(board[x][y].getPieceColor())){
//            possibleMoves.add("");
//        }
//        else
//            possibleMoves.add("You can beat opponent Piece at " + (x+2) + " " +(y-1));

        for(MovePoint moves : possibleMoves){
            System.out.println(moves);
        }


        return possibleMoves;
    }
}
