package demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;

import static demo.CarShop.createDefaultCarShop;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class CarShopTest {
    private static CarShop carShop;

    @BeforeClass
    public static void setup() {
        carShop = createDefaultCarShop();
    }

    @Test
    //1. Get all Porsche car names
    public void task1Test() {
        final List<String> porscheCarNames = carShop.getCars().stream()
                .filter(car -> car.getName().startsWith("Porsche"))
                .map(Car::getName)
                .collect(toList());
        porscheCarNames.forEach(System.out::println);
    }

    @Test
    //2. Get all car types
    public void task2Test() {
        final Set<CarType> carTypes = carShop.getCars().stream()
                .map(Car::getCarType)
                .collect(toSet());
        carTypes.forEach(System.out::println);
    }

    @Test
    //3. Get a list of Porsche cars sorted ascending by price
    public void task3Test() {
        final List<Car> porscheCars = carShop.getCars().stream()
                .filter(car -> car.getName().startsWith("Porsche"))
                .sorted(comparing(Car::getPrice))
                .collect(toList());
        porscheCars.forEach(System.out::println);
    }

    @Test
    //4. Get the fastest car
    public void task4Test() {
        final Car fastestCar = carShop.getCars().stream()
                .collect(maxBy(comparing(Car::getSpeed)))
                .get();
        System.out.println(fastestCar);
    }

    @Test
    //5. Get an average price for BMW cars
    public void task5Test() {
        final Double bmwAveragePrice = carShop.getCars().stream()
                .filter(car -> car.getName().startsWith("BMW"))
                .collect(averagingInt(Car::getPrice));
        System.out.println("BMW average price: " + bmwAveragePrice);
    }

    @Test
    //6. Get BMW cars price statistics (count, total price, average price, min/max price)
    public void task6Test() {
        final IntSummaryStatistics bmwPriceStatistics = carShop.getCars().stream()
                .filter(car -> car.getName().startsWith("BMW"))
                .collect(summarizingInt(Car::getPrice));
        System.out.println(bmwPriceStatistics);
    }

}