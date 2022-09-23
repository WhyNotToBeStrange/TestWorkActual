package Home14.Exercise2.Home13;

import Home8And11.Body.Transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Service {
    private List<Transport> transports;

    public Service(List<Transport> transports) {
        this.transports = transports;
    }

    private int consumptionCompare(Transport t1, Transport t2) {
        return Double.compare(t1.getConsumption(), t2.getConsumption());
    }

    public List<Transport> findNeededSpeed(double min,double max) {
        List<Transport> transportSpeed = new ArrayList<>();
        for (Transport transport:transports) {
            if(transport.getMaxSpeed()>min&&transport.getMaxSpeed()<max){
                transportSpeed.add(transport);
            }

        }

        return transportSpeed;
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
        transports.sort(this::consumptionCompare);

    }
    public static void show(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
            System.out.println(object);
        }
        System.out.println();
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }
}
