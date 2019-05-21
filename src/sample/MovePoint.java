package sample;

import java.util.Objects;

public class MovePoint {

    private int positionX;
    private int positionY;


    public MovePoint(int positionX, int positionY) {

        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj == null){

            return false;
        }
        if(obj instanceof MovePoint){
            MovePoint newPoints = (MovePoint)obj;
            return (positionX == newPoints.getPositionX()) && (positionY == newPoints.getPositionY());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY);
    }

    @Override
    public String toString() {
        if(getPositionX() == 0 && getPositionY() == 0){
            return "No moves available";
        }
        else
            return "You can move to " + getPositionX() + " " + getPositionY();
    }
}

