package Pieces;

public class Queen extends Pieces{

    private int X;
    private int Y;

    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        return false;
    }
}
