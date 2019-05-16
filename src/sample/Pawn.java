package sample;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(String pieceColor, char type){
        super(pieceColor, type);
    }


    @Override
    public List<String> move(Piece[][] board, int x, int y) {

        possibleMoves.clear();

        if (x == 6 && getPieceColor().equals("White")) {
            if ((board[5][y] == null && board[4][y] == null)) {
                possibleMoves.add("You can move on position 5 " + y);
                possibleMoves.add("Or to position 4 " + y);
                possibleMoves.add(canBeat(board[x - 1], x, y));


            } else if (board[5][y] == null && board[4][y] != null) {
                possibleMoves.add("You can move to position 5 " + y);
                possibleMoves.add(canBeat(board[x - 1], x, y));

            } else if (board[5][y] != null) {
                possibleMoves.add("No moves");
                possibleMoves.add(canBeat(board[x - 1], x, y));
            }
        }

        if (x !=6 && board[x][y].getType() == 'P') {
            if (board[x - 1][y] == null) {
                possibleMoves.add("You can move to position " + (x-1)+ " " + y);
            }
            if(board[x-1][y - 1] != null) {
                if(board[x-1][y - 1].getPieceColor().equals("Black")){
                    possibleMoves.add("You can take down opponent Piece on position " + (x-1) + (y-1));
                }
            }
            if (board[x-1][y + 1] != null) {
                if(board[x-1][y + 1].getPieceColor().equals("Black")){
                    possibleMoves.add("You can take down opponent Piece on position " + (x-1) + (y+1));
                }
            }
        }

        for(String moves : possibleMoves){
            System.out.println(moves);
        }


        return possibleMoves;

    }

    private String canBeat(Piece[] pieces, int x, int y) {
        if(((pieces[y - 1] != null) &&(pieces[y - 1].getPieceColor().equals("Black") )&& ((pieces[y + 1] != null) && (pieces[y + 1].getPieceColor().equals("Black"))))){
                return "You can take down opponent Piece on position " + (x-1) + (y-1) +" and " + (x-1) + (y+1);
        }else if(pieces[y - 1] != null) {
            if(pieces[y - 1].getPieceColor().equals("Black")){
                return ("You can take down opponent Piece on position " + (x-1) + (y-1));
            }
        }else if(pieces[y + 1] != null) {
            if((pieces[y + 1].getPieceColor().equals("Black"))){
                return "You can take down opponent Piece on position " + (x - 1) + (y + 1);
            }
        }

        return "No beat option";
    }

    public void printMoves(){
        for(int i =0; i<possibleMoves.size(); i++){
            System.out.println(possibleMoves.get(i));
        }
    }


}
