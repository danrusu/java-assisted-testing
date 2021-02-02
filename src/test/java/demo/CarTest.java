package demo;

import org.testng.annotations.Test;

import static demo.CarType.SEDAN;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private final String expected = "WELCOME TO FORD!"; // change this to fail the test

    @Test
    public void testGetWelcomeMessage() {
        final Car car = new Car("Ford", 180, SEDAN, 20000);
        assertThat(car.getWelcomeMessage()).isEqualTo(expected);
    }

}