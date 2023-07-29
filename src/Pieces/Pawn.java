package Pieces;

public class Pawn extends Pieces {

    private int X;
    private int Y;

    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        // Specific implementation for Pawn movement validation
        // ...
        return false;
    }
}
