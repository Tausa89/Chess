package sample;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(String pieceColor, char type){
        super(pieceColor, type);
    }


    @Override
    public List<MovePoint> possibleMoves(Piece[][] board, int x, int y) {

        possibleMoves.clear();

        if (x == 6 && getPieceColor().equals("White")) {
            if ((board[5][y] == null && board[4][y] == null)) {
                possibleMoves.add(new MovePoint(5,y));
                possibleMoves.add(new MovePoint(4,y));
//                possibleMoves.add(canBeat(board[x - 1], x, y));


            } else if (board[5][y] == null && board[4][y] != null) {
                possibleMoves.add(new MovePoint(5,y));
//                possibleMoves.add(canBeat(board[x - 1], x, y));

            } else if (board[5][y] != null) {
                possibleMoves.add(new MovePoint(0,0));
//                possibleMoves.add(canBeat(board[x - 1], x, y));
            }
        }

        if (x !=6 && board[x][y].getType() == 'P') {
            if (board[x - 1][y] == null) {
                possibleMoves.add(new MovePoint(x-1,y));
            }
//            if(board[x-1][y - 1] != null && board[x-1][y + 1] != null )
//            {
//                possibleMoves.add(canBeat(board[x-1],x,y));
//            }
//            if(board[x-1][y - 1] != null) {
//                possibleMoves.add(canBeat(board[x-1],x,y));
//            }
//            if (board[x-1][y + 1] != null) {
//                possibleMoves.add(canBeat(board[x-1],x,y));
//            }
        }

        for(MovePoint moves : possibleMoves){
            System.out.println(moves);
        }


        return possibleMoves;

    }

//    private MovePoint canBeat(Piece[] pieces, int x, int y) {
//        if(((pieces[y - 1] != null) &&(pieces[y - 1].getPieceColor().equals("Black") )&& ((pieces[y + 1] != null) && (pieces[y + 1].getPieceColor().equals("Black"))))){
//                return "You can take down opponent Piece on position " + (x-1) + (y-1) +" and " + (x-1) + (y+1);
//        }else if(pieces[y - 1] != null && pieces[y - 1].getPieceColor().equals("Black")) {
//                return ("You can take down opponent Piece on position " + (x-1) + (y-1));
//
//        }else if(pieces[y + 1] != null && (pieces[y + 1].getPieceColor().equals("Black"))) {
//                return "You can take down opponent Piece on position " + (x - 1) + (y + 1);
//        }
//
//        return "No beat option";
//    }

    public void printMoves(){
        for(int i =0; i<possibleMoves.size(); i++){
            System.out.println(possibleMoves.get(i));
        }
    }


}
