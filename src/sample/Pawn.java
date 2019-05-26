package sample;

import java.util.List;

public class Pawn extends Piece {

    public Pawn(String pieceColor, char type) {
        super(pieceColor, type);
    }


    @Override
    public List<MovePoint> possibleMoves(Piece[][] board, int x, int y) {

        possibleMoves.clear();

        if (x == 6 && getPieceColor().equals("White")) {
            addingPossibleMoves(board, y, 5, 4);
            takeDownOpportunity(y, board, 5, "Black");

        } else if (x == 1 && getPieceColor().equals("Black")) {
            addingPossibleMoves(board, y, 2, 3);
            takeDownOpportunity(y, board, 2, "White");
        }

        if (x != 6 && board[x][y].getType() == 'P' && board[x][y].getPieceColor().equals("White")) {
            if (board[x - 1][y] == null)
                possibleMoves.add(new MovePoint(x - 1, y));
            takeDownOpportunity(y, board, x - 1, "Black");
        }

        if (x != 1 && board[x][y].getType() == 'P' && board[x][y].getPieceColor().equals("Black")) {
            if (board[x + 1][y] == null)
                possibleMoves.add(new MovePoint(x + 1, y));
            takeDownOpportunity(y, board, x + 1, "White");
        }


        printMoves();


        return possibleMoves;

    }

    private void addingPossibleMoves(Piece[][] board, int y, int i, int i2) {
        if ((board[i][y] == null && board[i2][y] == null)) {
            possibleMoves.add(new MovePoint(i, y));
            possibleMoves.add(new MovePoint(i2, y));


        } else if (board[i][y] == null && board[i2][y] != null)
            possibleMoves.add(new MovePoint(i, y));
    }

    private void takeDownOpportunity(int y, Piece[][] board, int i, String white) {
        if (((board[i][y - 1] != null) && (board[i][y - 1].getPieceColor().equals(white)) && ((board[i][y + 1] != null) && (board[i][y + 1].getPieceColor().equals(white))))) {
            possibleTakeDowns.add(new MovePoint(i, y - 1));
            possibleTakeDowns.add(new MovePoint(i, y + 1));
        } else if (board[i][y - 1] != null && board[i][y - 1].getPieceColor().equals(white)) {
            possibleTakeDowns.add(new MovePoint(i, y - 1));
        } else if (board[i][y + 1] != null && (board[i][y + 1].getPieceColor().equals(white))) {
            possibleTakeDowns.add(new MovePoint(i, y + 1));
        }
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


}
