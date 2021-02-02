package demo;

import org.testng.annotations.Test;

import static demo.CarType.SEDAN;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    // change this to fail the test
    private final String EXPECTED_WELCOME_MESSAGE = "WELCOME TO FORD!";

    @Test
    public void testGetWelcomeMessage() {
        final Car car = new Car("Ford", 180, SEDAN, 20000);
        assertThat(car.getWelcomeMessage()).isEqualTo(EXPECTED_WELCOME_MESSAGE);
    }

}