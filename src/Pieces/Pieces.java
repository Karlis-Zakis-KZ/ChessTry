package Pieces;

public abstract class Pieces {
    protected String color;

    public Pieces(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Abstract method for movement validation
    public abstract boolean isValidMove(int fromX, int fromY, int toX, int toY);

    // Other shared methods can go here...
}
