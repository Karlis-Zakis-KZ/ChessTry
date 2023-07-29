package Pieces;

public class King extends Pieces{

    private int X;
    private int Y;

    public King(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        return false;
    }
}
