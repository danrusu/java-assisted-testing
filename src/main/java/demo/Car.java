package demo;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

/* Task
1. Create constructor, getters and override to String.
2. Install SonarLint plugin and fix code smells.
3. Create a instance method with the following spec and write a test for it.
   The method should be named getWelcomeMessage and
   it should return uppercase(WELCOME_MESSAGE + " to " + car.name + "!").
4. Install and configure Save Actions plugin.
5. Simplify code with Lombok.
*/

@AllArgsConstructor
@Value
@Slf4j
public class Car {
    String name;
    float speed;
    CarType carType;
    int price;

    private static final String WELCOME_MESSAGE = "welcome";

    public static void main(final String[] args) {
        log.info(WELCOME_MESSAGE);
    }

    public String getWelcomeMessage() {
        return String.format("%s to %s!", WELCOME_MESSAGE, this.name)
                .toUpperCase();
    }

}
