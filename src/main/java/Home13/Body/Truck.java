package Home13.Body;

public class Truck extends Transport {
    public int loadCapacity;
    public Truck(String name, double price, int maxSpeed, int hPower, double consumption,int loadCapacity) {
        super(name, price, maxSpeed, hPower, consumption);
    this.loadCapacity= loadCapacity;
    }

    public Truck(String[] array) {
        this(array[0],Double.parseDouble(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),
                Integer.parseInt(array[4]),Integer.parseInt(array[5]));
    }
    public String toOut(){
        return "Truck:"+","+name+ ","+price+","+maxSpeed+","+hPower+","+consumption
                +","+loadCapacity ;

    }
    public String toString(){
        return "Truck:"+","+name+ " his price- "+price+" his max speed- "+maxSpeed+" his horse power"+hPower+" his fuel consumption- "+consumption
                +"his load capacity"+loadCapacity ;

    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
