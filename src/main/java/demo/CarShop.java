package demo;

import java.util.List;

import static demo.CarType.*;
import static java.util.Arrays.asList;

public class CarShop {

    private final List<Car> cars;

    private CarShop(final List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public static CarShop createDefaultCarShop() {
        final List<Car> defaultCarList = asList(
                new Car("Dacia Duster", 170, SUV, 20_000),
                new Car("Porsche 718 Cayman", 310, SPORT, 70_000),
                new Car("BMW X5", 260, SUV, 80_000),
                new Car("Lexus LC500", 280, SPORT, 100_000),
                new Car("Ford Focus", 180, SEDAN, 25_000),
                new Car("BMW 520D", 220, SEDAN, 50_000),
                new Car("Porsche 911 Carerra", 350, SPORT, 120_000),
                new Car("BMW 760", 300, SEDAN, 110_000),
                new Car("Porsche Cayenne", 290, SUV, 115_000),
                new Car("Ford Edge", 200, SUV, 50_000)
        );

        return new CarShop(defaultCarList);
    }

/* Task
Create a default car shop and from it:
1. Get all Porsche car names
2. Get all car types
3. Get a list of Porsche cars sorted ascending by price
4. Get the fastest car
5. Get an average price for BMW cars
6. Get BMW cars price statistics (count, total price, average price, min/max price)
*/
}
