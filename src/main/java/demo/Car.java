package demo;

public class Car {
    private String name;
    private float speed;
    private CarType carType;
    private int price;

    private static String WELCOME_MESSAGE = "welcome";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
    }

    // Task - create a instance method with the following spec and write a test for it
    // Method name is getWelcomeMessage and it returns uppercase(WELCOME_MESSAGE + " to " + car.name + "!")
}
