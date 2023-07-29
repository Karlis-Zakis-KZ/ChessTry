package Pieces;

public class Queen extends Pieces{
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        return false;
    }
}
