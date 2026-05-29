public class Enums {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        System.out.println("green: " + Color.GREEN.ordinal());
        System.out.println("blue: " + Color.BLUE.ordinal());
    }
}
