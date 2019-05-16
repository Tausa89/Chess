package sample;

import java.util.ArrayList;

public class ChessBoard {

    private Piece[][] chessBoard =  new Piece[8][8];


    public ChessBoard() {
    }


    public void startingBoard(){

        Piece pawn1W = new Pawn("White",'P');
        Piece pawn2W = new Pawn("White",'P');
        Piece pawn3W = new Pawn("White",'P');
        Piece pawn4W = new Pawn("White",'P');
        Piece pawn5W = new Pawn("White",'P');
        Piece pawn6W = new Pawn("White",'P');
        Piece pawn7W = new Pawn("White",'P');
        Piece pawn8W = new Pawn("White",'P');
        Piece rook1W = new Rook("White",'R');
        Piece rook2W = new Rook("White",'R');
        Piece knight1W = new Knight("White",'k');
        Piece knight2W = new Knight("White",'k');
        Piece bishop1W = new Bishop("White",'B');
        Piece bishop2W = new Bishop("White",'B');
        Piece queenW = new Queen("White", 'Q');
        Piece kingW = new King("White", 'K');
        Piece pwant1B = new Pawn("Black",'P');
        Piece pwant2B = new Pawn("Black",'P');
        Piece pwant3B = new Pawn("Black",'P');
        Piece pwant4B = new Pawn("Black",'P');
        Piece pwant5B = new Pawn("Black",'P');
        Piece pwant6B = new Pawn("Black",'P');
        Piece pwant7B = new Pawn("Black",'P');
        Piece pwant8B = new Pawn("Black",'P');
        Piece rook1B = new Rook("White",'R');
        Piece rook2B = new Rook("White",'R');
        Piece knight1B = new Knight("White",'k');
        Piece knight2B = new Knight("White",'k');
        Piece bishop1B = new Bishop("White",'B');
        Piece bishop2B = new Bishop("White",'B');
        Piece queenB = new Queen("White", 'Q');
        Piece kingB = new King("White", 'K');

        Piece[][] board = {
                {rook1B,knight1B,bishop1B,queenB,kingB,bishop2B,knight2B,rook2B},
                {pwant1B,pwant2B,pwant3B,pwant4B,pwant5B,pwant6B,pwant7B,pwant8B},
                {null,null,null,null,null,null,null,null},
                {null,null,null,null,null,null,null,null},
                {null,null,null,null,null,null,null,null},
                {null,null,null,null,null,null,null,null},
                {pawn1W,pawn2W,pawn3W,pawn4W,pawn5W,pawn6W,pawn7W,pawn8W},
                {rook1W,knight1W,bishop1W,queenW,kingW,bishop2W,knight2W,rook2W}
        };
        this.chessBoard = board;

    }

    public Piece[][] getChessBoard() {
        return chessBoard;
    }

    public void addKnight(int x, int y, String color){
        this.chessBoard[x][y] = new Knight(color,'k');
    }

    public void removePiece(int x, int y){
        this.chessBoard[x][y] = null;
    }

    public void move(){
        if (this.chessBoard[4][0]==null){
            this.chessBoard[4][0] = new Pawn("White",'P');
            this.chessBoard[0][6] = null;
        }
    }

    public void printTab(){
        for(int i = 0; i < 8; i++){
            System.out.print("\n");

            for (int j = 0; j <8; j++){
                System.out.print(" ");
                if(this.chessBoard[i][j]==null){
                    System.out.print(".");
                }else
                    System.out.print(this.chessBoard[i][j].toString());
            }
        }
    }

    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        board.startingBoard();

        board.addKnight(4,4,"White");
        board.addKnight(3,2,"White");
        board.addKnight(5,2,"Black");


        board.get(4,4).move(board.getChessBoard(),4,4);
//



        board.printTab();
    }

    public Piece get(int x,int y){
        return this.chessBoard[x][y];
    }

    public void getCords(ChessBoard [][]boards){

    }


}

