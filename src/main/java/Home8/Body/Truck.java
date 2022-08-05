package Home8.Body;

public class Truck extends Transport{
    public int loadCapacity;
    public Truck(String name, double price, int maxSpeed, int hPower, double consumption,int loadCapacity) {
        super(name, price, maxSpeed, hPower, consumption);
    this.loadCapacity= loadCapacity;
    }
    public String toString(){
        return "Truck:"+" Name:"+name+ " his price- "+price+" his max speed- "+maxSpeed+" his horse power"+hPower+" his fuel consumption- "+consumption
                +"his load capacity"+loadCapacity ;

    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
