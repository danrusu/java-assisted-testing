package demo;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Car {
    private String name;
    private float speed;
    private CarType carType;
    private int price;

    private static String WELCOME_MESSAGE = "welcome";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
    }

    // Task - write a for test
    public String getWelcomeMessage() {
        // returns uppercase(WELCOME_MESSAGE + " to " + name + "!")
        return "";
    }
}
