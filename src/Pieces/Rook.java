package Pieces;

public class Rook extends Pieces{
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        return false;
    }
}
