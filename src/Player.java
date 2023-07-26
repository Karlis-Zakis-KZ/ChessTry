public class Player {

    private static String color;
    private static String name;

    Player setUserInformation(String color, String name) {
        Player.color = color;
        Player.name = name;
        return null;
    }

    public void printUserInfo() {
        System.out.println(color);
        System.out.println(name);
    }
}
