package demo;

public class Car {
    private String name;
    private float speed;

    private static String WELCOME_MESSAGE = "welcome";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
    }

    public String getWelcomeMessage() {
        // returns WELCOME_MESSAGE + " in " + name
        return "";
    }
}
