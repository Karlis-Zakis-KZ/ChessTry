import Pieces.Pieces;

import java.util.List;

public class Board {

    private final int BOARD_SIZE = 8;
    private Pieces[][] board;

    private Player whitePlayer;
    private Player blackPlayer;


    public void ChessBoard(Player player1, Player player2) {
        board = new Pieces[BOARD_SIZE][BOARD_SIZE];
        whitePlayer = player1;
        blackPlayer = player2;
        initializeBoard();
    }

    private void initializeBoard() {
        // Retrieve the pieces for each player
        List<Pieces> whitePieces = whitePlayer.getPieces();
        List<Pieces> blackPieces = blackPlayer.getPieces();

        // Place the pieces on the board according to their positions
        for (Pieces piece : whitePieces) {
            int x = piece.getX(); // Get the x-coordinate of the piece's position
            int y = piece.getY(); // Get the y-coordinate of the piece's position
            board[y][x] = piece;
        }

        for (Pieces piece : blackPieces) {
            int x = piece.getX(); // Get the x-coordinate of the piece's position
            int y = piece.getY(); // Get the y-coordinate of the piece's position
            board[y][x] = piece;
        }
    }

    public void printBoard() {
        System.out.println("  a b c d e f g h");
        System.out.println("  -----------------");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print((BOARD_SIZE - i) + "|");
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == null) {
                    System.out.print("  ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println("|" + (BOARD_SIZE - i));
        }
        System.out.println("  -----------------");
        System.out.println("  a b c d e f g h");
    }

}
