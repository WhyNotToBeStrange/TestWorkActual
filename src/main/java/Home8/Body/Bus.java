package Home8.Body;

public class Bus extends Transport{
    public int capacity;
    public Bus(String name, double price, int maxSpeed, int hPower, double consumption,int capacity) {
        super(name, price, maxSpeed, hPower, consumption);
    this.capacity= capacity;
    }
    public String toString(){
        return "Bus:"+" Name:"+name+ " his price- "+price+" his max speed- "+maxSpeed+" his horse power"+hPower+" his fuel consumption- "+consumption
                +"his capacity"+capacity ;

    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
