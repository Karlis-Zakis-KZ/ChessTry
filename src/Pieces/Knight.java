package Pieces;

public class Knight extends Pieces{

    private int X;
    private int Y;

    public Knight(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        return false;
    }
}
