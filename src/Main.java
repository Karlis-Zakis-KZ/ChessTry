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


        Board.initializeBoard(board);
        Board.displayBoard(board);


    }
}