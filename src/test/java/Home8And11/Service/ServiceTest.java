package Home8And11.Service;

import Home8And11.Body.Bus;
import Home8And11.Body.Car;
import Home8And11.Body.Transport;
import Home8And11.Body.Truck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ServiceTest {
    @ParameterizedTest
    @MethodSource("argumentsStreamPriceTest")
    void priceTest(Transport[] transports, double expected) {
        Service tester = new Service(transports);

        double res = tester.allPrices();

        Assertions.assertEquals(expected, res);
    }

    private static Stream<Arguments> argumentsStreamPriceTest() {
        return Stream.of(
                Arguments.of(new Transport[] {  new Car("Lexus Rx7", 1200000, 380, 550, 5.0, "Black "),
                        new Bus("Bogdan", 300000, 100, 180, 7.5 , 50)}, 1500000),
                Arguments.of(new Transport[] {}, 0)
        );
    }

    @Test
    void fuelCostUpTest() {
        Transport[] transports = new Transport[] {
                new Car("Nissan Sky Line GTR", 1134500, 320, 620, 3.5, "Blue"),
                new Car("Toyota Supra", 700000, 450, 680, 4.0,"Red"),
                new Car("Lexus Rx7", 1200000, 380, 550, 5.0, "Black "),
        };
        Service tester = new Service(transports);

        Transport[] res = tester.sortFuelCostUp();
        boolean flag = true;
        for (int i = 0; i < res.length - 1; i++) {
            if (res[i].getConsumption() < res[i + 1].getConsumption()) {
                flag = false;
                break;
            }
        }

        Assertions.assertTrue(flag);
    }

    @Test
    void fuelCostDownTest() {
        Transport[] transports = new Transport[] {
                new Car("Nissan Sky Line GTR", 1134500, 320, 620, 3.5, "Blue"),
                new Car("Toyota Supra", 700000, 450, 680, 4.0,"Red"),
                new Car("Lexus Rx7", 1200000, 380, 550, 5.0, "Black "),
        };
        Service tester = new Service(transports);

        Transport[] res = tester.sortFuelCostUp();
        boolean flag = true;
        for (int i = 0; i < res.length - 1; i++) {
            if (res[i].getConsumption() > res[i + 1].getConsumption()) {
                flag = false;
                break;
            }
        }

        Assertions.assertTrue(flag);
    }

    @ParameterizedTest
    @MethodSource("argumentsStreamForSpeedTest")
    void SpeedTest(Transport[] transports, int min, int max, int expected) {
        Service tester = new Service(transports);

        Transport[] newArray = tester.findNeededSpeed(min, max);
        int res = newArray.length;
        boolean flag = true;
        for (Transport vehicle : newArray) {
            if (vehicle.getMaxSpeed() < min || vehicle.getMaxSpeed() > max) {
                flag = false;
                break;
            }
        }

        Assertions.assertEquals(expected, res);
        Assertions.assertTrue(flag);
    }

    private static Stream<Arguments> argumentsStreamForSpeedTest() {
        return Stream.of(
                Arguments.of(new Transport[] {
                        new Car("Nissan Sky Line GTR", 1134500, 320, 620, 3.5, "Blue"),
                        new Car("Toyota Supra", 700000, 450, 680, 4.0,"Red"),
                        new Car("Lexus Rx7", 1200000, 380, 550, 5.0, "Black "),
                        new Bus("Bogdan", 300000, 100, 180, 7.5 , 50),
                        new Bus("Sprinter", 250000, 110, 170, 6.5,30),
                        new Bus("Mercedes Vivo", 350000, 180, 300, 4.5,12),
                        new Truck("Toyota Tundra", 1000000, 200, 420, 5.5,500),
                        new Truck("Dodge Rover", 120000, 270, 480, 6,400)
                }, 150, 300, 3),
                Arguments.of(new Transport[] {
                        new Car("Nissan Sky Line GTR", 1134500, 320, 620, 3.5, "Blue"),
                        new Car("Toyota Supra", 700000, 450, 680, 4.0,"Red"),
                        new Car("Lexus Rx7", 1200000, 380, 550, 5.0, "Black "),
                        new Bus("Bogdan", 300000, 100, 180, 7.5 , 50),
                        new Bus("Sprinter", 250000, 110, 170, 6.5,30),
                        new Bus("Mercedes Vivo", 350000, 180, 300, 4.5,12),
                        new Truck("Toyota Tundra", 1000000, 200, 420, 5.5,500),
                        new Truck("Dodge Rover", 120000, 270, 480, 6,400)
                }, 0, 130, 3),
                Arguments.of(new Transport[] {}, 0, 0, 0)
        );
    }
}