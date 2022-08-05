package Home8.Work;

import Home8.Body.Bus;
import Home8.Body.Car;
import Home8.Body.Transport;
import Home8.Body.Truck;
import Home8.Service.Service;

import static Home8.Service.Service.show;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Car("Nissan Sky Line GTR", 1134500, 320, 620, 3.5, "Blue"),
                new Car("Toyota Supra", 700000, 450, 680, 4.0,"Red"),
                new Car("Lexus Rx7", 1200000, 380, 550, 5.0, "Black "),
                new Bus("Bogdan", 300000, 100, 180, 7.5 , 50),
                new Bus("Sprinter", 250000, 110, 170, 6.5,30),
                new Bus("Mercedes Vivo", 350000, 180, 300, 4.5,12),
                new Truck("Toyota Tundra", 1000000, 200, 420, 5.5,500),
                new Truck("Dodge Rover", 120000, 270, 480, 6,400)
        };
        show(transports);
        Service service = new Service(transports);
        show(service.sortFuelCostDown());
        show(service.sortFuelCostUp());
        show(service.findNeededSpeed(200,400));
        System.out.println(service.allPrices());
    }
}
