public class Board {
    public static void initializeBoard(char[][] board) {
        char[][] initialBoard = {
                {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
        };

        for (int i = 0; i < 8; i++) {
            System.arraycopy(initialBoard[i], 0, board[i], 0, 8);
        }
    }

    public static void displayBoard(char[][] board) {
        System.out.println("  a b c d e f g h");
        System.out.println("  -----------------");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + "|");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|" + (8 - i));
        }
        System.out.println("  -----------------");
        System.out.println("  a b c d e f g h");
    }
}
