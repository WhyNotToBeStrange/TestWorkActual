package Home8.Service;

import Home8.Body.Transport;

public class Service implements Taxopark {
    private Transport[] transports;

    public Service(Transport[] transports) {
        this.transports = transports;
    }
    private Transport[] copy(Transport[] transports){
        int length = transports.length;
        Transport[] newmass = new Transport[length];
        for(int i =0;i<length;i++){
            newmass[i]=transports[i];
        }
        return newmass;
    }

    public Transport[] findNeededSpeed(double min,double max) {
        Transport[] transportSpeed = new Transport[]{ };
        for (Transport transport:transports) {
            if(transport.getMaxSpeed()>min&&transport.getMaxSpeed()<max){
                transportSpeed= copy(transportSpeed);
            }
            
        }

        return transportSpeed;
    }


    public Transport[] sortFuelCostUp() {
        Transport[] array = new Transport[transports.length];
        array=copy(transports);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getConsumption() < array[i + 1].getConsumption()) {
                    isSorted = false;
                    Transport buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }

    public Transport[] sortFuelCostDown() {
        Transport[] array = new Transport[transports.length];
        array=copy(transports);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getConsumption() > array[i + 1].getConsumption()) {
                    isSorted = false;
                    Transport buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }

    public double allPrices() {
        double costAll=0;
        for (Transport transport:transports) {
            costAll+=transport.price;

        }
        return costAll;
    }
    public static void show(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
            System.out.println(object);
        }
        System.out.println();
    }
}
