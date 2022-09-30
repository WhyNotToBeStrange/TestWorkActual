package Home16;


import Home16.Body.Bus;
import Home16.Body.Car;
import Home16.Body.Transport;
import Home16.Service;
import Home16.Body.Truck;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Transport[] transportsArray = new Transport[]{
                new Car("Nissan Sky Line GTR", 1134500, 320, 620, 3.5, "Blue"),
                new Car("Toyota Supra", 700000, 450, 680, 4.0,"Red"),
                new Car("Lexus Rx7", 1200000, 380, 550, 5.0, "Black "),
                new Bus("Bogdan", 300000, 100, 180, 7.5 , 50),
                new Bus("Sprinter", 250000, 110, 170, 6.5,30),
                new Bus("Mercedes Vivo", 350000, 180, 300, 4.5,12),
                new Truck("Toyota Tundra", 1000000, 200, 420, 5.5,500),
                new Truck("Dodge Rover", 120000, 270, 480, 6,400)
        };

        ArrayList<Transport> transportList = new ArrayList<>(Arrays.asList(transportsArray));
        Service service = new Service(transportList);
        service.fuelSortMethod();
        System.out.println(service.allPrice());
        System.out.println(service.findNeededSpeed(200,400));
        System.out.println(service.getTransports());
    }
}
