package Pieces;

public class Rook extends Pieces{

    private int X;
    private int Y;

    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        return false;
    }
}
