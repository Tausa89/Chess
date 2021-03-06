package sample;

public class ChessBoard {

    private Piece[][] chessBoard =  new Piece[8][8];


    public ChessBoard() {

        this.chessBoard = new Piece[8][8];
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
        Piece rook1B = new Rook("Black",'R');
        Piece rook2B = new Rook("Black",'R');
        Piece knight1B = new Knight("Black",'k');
        Piece knight2B = new Knight("Black",'k');
        Piece bishop1B = new Bishop("Black",'B');
        Piece bishop2B = new Bishop("Black",'B');
        Piece queenB = new Queen("Black", 'Q');
        Piece kingB = new King("Black", 'K');

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

    public void addPawn(int x, int y, String color){
        this.chessBoard[x][y] = new Pawn(color, 'P') {
        };
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

//        Scanner input = new Scanner(System.in);

        ChessBoard board = new ChessBoard();
        board.startingBoard();

        board.addPawn(3,2,"Black");
        board.addPawn(3,4,"White");
        board.addPawn(4,3,"White");
        board.get(4,3).possibleMoves(board.getChessBoard(),4,3);
        board.pieceTakeDown(4,3,3,2);












        board.printTab();
    }

    public Piece get(int x,int y){
        return this.chessBoard[x][y];
    }

    public boolean movePiece(int currentPositionX,int currentPositionY, int newPositionX, int newPositionY){

        this.chessBoard[currentPositionX][currentPositionY].possibleMoves(this.getChessBoard(),currentPositionX,currentPositionY);
        if(this.chessBoard[currentPositionX][currentPositionY].possibleMoves.contains(new MovePoint(newPositionX,newPositionY))){
            Piece pieceToMove = get(currentPositionX,currentPositionY);
            this.chessBoard[newPositionX][newPositionY] = pieceToMove;
            removePiece(currentPositionX,currentPositionY);

            System.out.println("You moved " + this.chessBoard[newPositionX][newPositionY].getType() + " from position "
            + currentPositionX + " " + currentPositionY + " to position " + newPositionX + " " + newPositionY);

            return true;
        }else {
            System.out.println("Move wasn't able");
            return false;
        }

    }

    public boolean pieceTakeDown(int currentPositionX, int currentPositionY, int opponentPiecePositionX, int opponentPiecePositionY){

        if(this.chessBoard[currentPositionX][currentPositionY].possibleTakeDowns.contains(new MovePoint(opponentPiecePositionX,opponentPiecePositionY))){
            Piece beatingPiece = get(currentPositionX,currentPositionY);
            this.chessBoard[opponentPiecePositionX][opponentPiecePositionY] = beatingPiece;
            removePiece(currentPositionX,currentPositionY);

            System.out.println("You have beat opponent piece at position " + opponentPiecePositionX + " " +opponentPiecePositionY);
            return true;
        }else {
            System.out.println("Beating wasn't able");
            return false;
        }

    }





}

