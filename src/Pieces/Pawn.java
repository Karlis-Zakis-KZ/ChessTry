package Pieces;

public class Pawn extends Pieces {
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
