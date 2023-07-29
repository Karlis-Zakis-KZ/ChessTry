import Pieces.Pieces;
import Pieces.Pawn;
import Pieces.Bishop;
import Pieces.Queen;
import Pieces.King;
import Pieces.Rook;
import Pieces.Knight;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String color;
    private String name;

    private List<Pieces> pieces;

    Player setUserInformation(String color, String name) {
        this.color = color;
        this.name = name;
        pieces = new ArrayList<>();
        this.createAllPieces();
        return null;
    }

    public void addPiece(Pieces Pieces) {
        pieces.add(Pieces);
    }

    private void createAllPieces() {
        for (int i = 1; i <= 8; i++) {
            pieces.add(new Pawn(color));
        }
        pieces.add(new Rook(color));
        pieces.add(new Rook(color));
        pieces.add(new Queen(color));
        pieces.add(new King(color));
        pieces.add(new Knight(color));
        pieces.add(new Knight(color));
        pieces.add(new Bishop(color));
        pieces.add(new Bishop(color));
    }

    public List<Pieces> getPieces() {
        return pieces;
    }

    public void printUserInfo() {
        System.out.println(color);
        System.out.println(name);
    }
}
