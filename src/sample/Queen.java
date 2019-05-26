package sample;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {

    public Queen(String pieceColor, char type) {
        super(pieceColor, type);
    }

    @Override
    public List<MovePoint> possibleMoves(Piece[][] board, int x, int y) {


        int nextPositionX = x - 1;
        int nextPositionY = y - 1;

        checkingDirectionMinusMinus(board, x, y, nextPositionX, nextPositionY);

        nextPositionX = x - 1;
        nextPositionY = y + 1;


        checkingDirectionMinusPlus(board, x, y, nextPositionX, nextPositionY);

        nextPositionX = x + 1;
        nextPositionY = y + 1;

        checkingDirectionPlusPlus(board, x, y, nextPositionX, nextPositionY);

        nextPositionX = x + 1;
        nextPositionY = y - 1;

        checkingDirectionPlusMinus(board, x, y, nextPositionX, nextPositionY);

        int nextPosition = x - 1;
        checkingCoordinatesMinusX(board, x, y, nextPosition);

        nextPosition = x + 1;
        checkingCoordinatesPlusX(board, x, y, nextPosition);

        nextPosition = y - 1;
        checkingCoordinatesMinusY(board, x, y, nextPosition);

        nextPosition = y + 1;
        checkingCoordinatesPlusY(board, x, y, nextPosition);

        printMoves();

        return possibleMoves;
    }
    private void checkingCoordinatesPlusY(Piece[][] board, int x, int y, int nextPosition) {
        while (nextPosition < 8) {
            if (board[x][nextPosition] == null) {
                if (!possibleMoves.contains(new MovePoint(x, nextPosition))) {
                    possibleMoves.add(new MovePoint(x, nextPosition));
                }
            } else if (board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals(board[x][y].getPieceColor())) {
                return;
            } else {
                if(possibleTakeDowns.contains(new MovePoint(x,nextPosition))){
                    return;
                }else {
                    possibleTakeDowns.add(new MovePoint(x,nextPosition));
                    return;
                }

            }
            nextPosition++;
        }
    }

    private void checkingCoordinatesMinusY(Piece[][] board, int x, int y, int nextPosition) {
        while (nextPosition >= 0) {
            if (board[x][nextPosition] == null) {
                if (!possibleMoves.contains(new MovePoint(x, nextPosition))) {
                    possibleMoves.add(new MovePoint(x, nextPosition));
                }
            } else if (board[x][nextPosition] != null && board[x][nextPosition].getPieceColor().equals(board[x][y].getPieceColor())) {
                return;
            } else {
                if(possibleTakeDowns.contains(new MovePoint(x,nextPosition))){
                    return;
                }else {
                    possibleTakeDowns.add(new MovePoint(x,nextPosition));
                    return;
                }

            }
            nextPosition--;
        }
    }

    private void checkingCoordinatesPlusX(Piece[][] board, int x, int y, int nextPosition) {
        while (nextPosition < 8) {
            if (board[nextPosition][y] == null) {
                if (!possibleMoves.contains(new MovePoint(nextPosition, y))) {
                    possibleMoves.add(new MovePoint(nextPosition, y));
                }
            } else if (board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals(board[x][y].getPieceColor())) {
                return;
            } else {
                if(possibleTakeDowns.contains(new MovePoint(nextPosition,y))){
                    return;
                }else {
                    possibleTakeDowns.add(new MovePoint(nextPosition,y));
                    return;
                }

            }

            nextPosition++;
        }
    }

    private void checkingCoordinatesMinusX(Piece[][] board, int x, int y, int nextPosition) {
        while (nextPosition >= 0) {
            if (board[nextPosition][y] == null) {
                if (!possibleMoves.contains(new MovePoint(nextPosition, y))) {
                    possibleMoves.add(new MovePoint(nextPosition, y));
                }

            } else if (board[nextPosition][y] != null && board[nextPosition][y].getPieceColor().equals(board[x][y].getPieceColor())) {
                return;
            } else {
                if(possibleTakeDowns.contains(new MovePoint(nextPosition,y))){
                    return;
                }else {
                    possibleTakeDowns.add(new MovePoint(nextPosition,y));
                    return;
                }

            }
            nextPosition--;
        }
    }

    private void checkingDirectionPlusMinus(Piece[][] board, int x, int y, int nextPositionX, int nextPositionY) {
        while (nextPositionX < 8 && nextPositionY >= 0) {
            if (board[nextPositionX][nextPositionY] == null) {
                if (!possibleMoves.contains(new MovePoint(nextPositionX, nextPositionY))) {
                    possibleMoves.add(new MovePoint(nextPositionX, nextPositionY));
                }

            } else if (board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals(board[x][y].getPieceColor())) {
                return;
            } else {
                takeDownPossibility(nextPositionX, nextPositionY);
                return;
            }
            nextPositionX++;
            nextPositionY--;
        }
    }

    private void takeDownPossibility(int nextPositionX, int nextPositionY) {
        if (possibleTakeDowns.contains(new MovePoint(nextPositionX, nextPositionY))) {
            return;
        } else
            possibleTakeDowns.add(new MovePoint(nextPositionX, nextPositionY));

    }

    private void checkingDirectionPlusPlus(Piece[][] board, int x, int y, int nextPositionX, int nextPositionY) {
        while (nextPositionX < 8 && nextPositionY < 8) {
            if (board[nextPositionX][nextPositionY] == null) {
                if (!possibleMoves.contains(new MovePoint(nextPositionX, nextPositionY))) {
                    possibleMoves.add(new MovePoint(nextPositionX, nextPositionY));
                }
            } else if (board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals(board[x][y].getPieceColor())) {
                break;
            }else {
                takeDownPossibility(nextPositionX, nextPositionY);
                return;
            }
            nextPositionX++;
            nextPositionY++;
        }
    }

    private void checkingDirectionMinusPlus(Piece[][] board, int x, int y, int nextPositionX, int nextPositionY) {
        while (nextPositionX >= 0 && nextPositionY < 8) {
            if (board[nextPositionX][nextPositionY] == null) {
                if (!possibleMoves.contains(new MovePoint(nextPositionX, nextPositionY))) {
                    possibleMoves.add(new MovePoint(nextPositionX, nextPositionY));
                }
            } else if (board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals(board[x][y].getPieceColor())) {
                break;
            }else {
                takeDownPossibility(nextPositionX, nextPositionY);
                return;
            }
            nextPositionX--;
            nextPositionY++;
        }
    }

    private void checkingDirectionMinusMinus(Piece[][] board, int x, int y, int nextPositionX, int nextPositionY) {
        while (nextPositionX >= 0 && nextPositionY >= 0) {
            if (board[nextPositionX][nextPositionY] == null) {
                if (!possibleMoves.contains(new MovePoint(nextPositionX, nextPositionY))) {
                    possibleMoves.add(new MovePoint(nextPositionX, nextPositionY));
                }
            } else if (board[nextPositionX][nextPositionY] != null && board[nextPositionX][nextPositionY].getPieceColor().equals(board[x][y].getPieceColor())) {
                break;
            }else {
                takeDownPossibility(nextPositionX, nextPositionY);
                return;
            }
            nextPositionX--;
            nextPositionY--;
        }
    }



}
