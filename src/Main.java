import Pieces.Pawn;
import Pieces.Pieces;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[8][8];

        System.out.println("First player Name");

        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();

        Player Player1 = new Player();
        Player1.setUserInformation("White",name);
        Player1.printUserInfo();

        System.out.println("Second player Name");

        name = myScanner.nextLine();
        Player Player2 = new Player();
        Player2.setUserInformation("Black",name);
        Player2.printUserInfo();


        Player1.printUserInfo();


        System.out.println("Available pieces for White player:");
        List<Pieces> whitePieces = Player1.getPieces();
        for (Pieces piece : whitePieces) {
            System.out.println(piece.getClass().getSimpleName());
            System.out.println(piece.getColor());
        }

        System.out.println("Available pieces for Black player:");
        List<Pieces> blackPieces = Player2.getPieces();
        for (Pieces piece : blackPieces) {
            System.out.println(piece.getClass().getSimpleName());
            System.out.println(piece.getColor());
        }


        Board.initializeBoard(board);
        Board.displayBoard(board);


    }
}