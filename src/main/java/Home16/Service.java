package Home16;

import Home8And11.Body.Transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private List<Transport> transports;

    public Service(List<Transport> transports) {
        this.transports = transports;
    }

    private int consumptionCompare(Transport t1, Transport t2) {
        return Double.compare(t1.getConsumption(), t2.getConsumption());
    }

    public List<Transport> findNeededSpeed(double min, double max) {
        return (List<Transport>) transports.stream().filter(transport -> transport.getMaxSpeed() >= min && transport.getMaxSpeed() <= max).toList();
    }


    public void lambdaSortMethod() {
        transports.sort((t1, t2) -> (Double.compare(t1.getConsumption(), t2.getConsumption())));
    }

    public void methodWithInterface() {
        transports.sort(new Comparator<Transport>() {
            public int compare(Transport t1, Transport t2) {
                return Double.compare(t1.getConsumption(), t2.getConsumption());
            }
        });
    }

    public void fuelSortMethod() {
        transports = transports.stream()
                .sorted(this::consumptionCompare)
                .toList();

    }

    public List<Double> allPrice() {
        return transports.stream()
                .map((Transport::getPrice))
                .toList();
    }

    public static void show(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
            System.out.println(object);
        }
        System.out.println();
    }

    public String toString() {
        return transports.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }
}
