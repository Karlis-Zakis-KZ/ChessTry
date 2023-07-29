package Pieces;

public class Bishop extends Pieces{

    private int X;
    private int Y;

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        return false;
    }
}
